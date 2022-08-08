package com.springCourse.springBootcamp.Payment.Installment;

public enum PaymentInstallment {
    DIRECT("Direct"),
    ONE_MONTH("One_Month"),
    THREE_MONTH("Three-Month"),
    NINE_MONTH("Nine_Month"),
    TWELVE_MONTH("Twelve-Month");

    private final String paymentInstallment;

    PaymentInstallment(String paymentInstallment){this.paymentInstallment=paymentInstallment;}

    @Override
    public String toString(){return paymentInstallment;}
}
