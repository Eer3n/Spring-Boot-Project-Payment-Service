package com.springCourse.springBootcamp.User.Dto;

import com.springCourse.springBootcamp.User.CreditStatus.CreditStatus;
import com.springCourse.springBootcamp.User.Gender.Gender;
import lombok.Data;

@Data
public class UserDto {

    private Long Id;
    private String name;
    private String surname;
    private int identityNumber;
    private String mailAddress;
    private String password;
    private int age;
    private Gender gender;
    private int creditScore;
    private CreditStatus userCreditStatus;
}
