package com.springCourse.springBootcamp.User.Entity;

import com.springCourse.springBootcamp.User.Enum.Gender;
import com.springCourse.springBootcamp.User.Enum.UserCreditLevel;
import com.springCourse.springBootcamp.User.Enum.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SPRING_USER", schema = "public")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private String surname;
    private String identityNumber;
    private Date dateOfBirth;
    private Gender gender;
    private UserCreditLevel userCreditLevel;
    private UserStatus userStatus;
}
