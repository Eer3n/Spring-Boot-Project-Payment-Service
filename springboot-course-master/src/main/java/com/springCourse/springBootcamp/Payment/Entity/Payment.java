package com.springCourse.springBootcamp.Payment.Entity;

import com.springCourse.springBootcamp.Payment.Entity.Base.BaseEntity;
import com.springCourse.springBootcamp.Payment.Enum.PaymentChannel;
import com.springCourse.springBootcamp.Payment.Enum.PaymentInstallment;
import com.springCourse.springBootcamp.Payment.Enum.PaymentType;
import com.springCourse.springBootcamp.User.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SPRING_PAYMENT", schema = "public")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment extends BaseEntity implements Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Long transactionNumber;
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    double amount;
    private PaymentChannel paymentChannel;
    private PaymentType paymentType;
    private PaymentInstallment paymentInstallment;
    Date insDate;

    @Override
    public Payment clone() {
        try {
            Payment clone = (Payment) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
