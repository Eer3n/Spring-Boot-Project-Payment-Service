package com.springCourse.springBootcamp.User.CreditStatus;

public enum CreditStatus {

    FIRST("First"),
    LEVEL_ONE("Level-One"),
    LEVEL_TWO("Level-Two"),
    LEVEL_THREE("Level-Three"),
    LEVEL_FOUR("Level-Four"),
    LEVEL_FIVE("Level-Five"),
    REVOKED("Revoked"),
    BANNED("Banned"),
    LAST("Last");

    private final String creditStatus;

    CreditStatus(String creditStatus){this.creditStatus=creditStatus;}

    public String toString(){return  creditStatus;}
}
