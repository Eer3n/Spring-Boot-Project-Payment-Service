package com.springCourse.springBootcamp.User.Entity;

import com.springCourse.springBootcamp.User.CreditStatus.CreditStatus;
import com.springCourse.springBootcamp.User.Gender.Gender;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "SPRING_USER")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private String surname;
    private int identityNumber;
    private String mailAddress;
    private String password;
    private int age;
    private int creditScore;

    @Enumerated
    private Gender gender;
    private CreditStatus creditStatus;

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return Id != null && Objects.equals(Id, user.Id);
    }

    @Override
    public int hashCode(){return getClass().hashCode();}
}
