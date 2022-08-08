package com.springCourse.springBootcamp.Payment.Type;

public enum PaymentType {
    FIRST("First"),
    CREDIT("Credit"),
    BILL("Bill"),
    CAR_FEE("Car_fee"),
    TAX("Tax"),
    HOUSE_FEE("House_fee"),
    OTHER("Other"),
    LAST("Last");

    private final String paymentType;

    PaymentType(String paymentType){this.paymentType=paymentType;}

    @Override
    public String toString(){return paymentType;}
}
