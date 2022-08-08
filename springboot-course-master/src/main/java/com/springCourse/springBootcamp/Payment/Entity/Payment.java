package com.springCourse.springBootcamp.Payment.Entity;

import com.springCourse.springBootcamp.Payment.Channel.PaymentChannel;
import com.springCourse.springBootcamp.Payment.Credit.Credit;
import com.springCourse.springBootcamp.Payment.Installment.PaymentInstallment;
import com.springCourse.springBootcamp.Payment.Type.PaymentType;
import com.springCourse.springBootcamp.User.Dto.UserDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "SPRING_USER")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Long transactionNumber;
    private UserDto userDto;
    private double amount;
    private Date transactionDate;

    @Enumerated(EnumType.ORDINAL)
    private PaymentType paymentType;
    private PaymentInstallment paymentInstallment;
    private Credit credit;
    private PaymentChannel paymentChannel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Payment payment = (Payment) o;
        return Id != null && Objects.equals(Id, payment.Id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
