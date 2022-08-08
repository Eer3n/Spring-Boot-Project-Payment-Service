package com.springCourse.springBootcamp.Payment.Channel;

public enum PaymentChannel {

    CREDIT_CARD_AKBANK("Credit_Card_Akbank"),
    CREDIT_CARD_GARANTI("Credit_Card_Garanti"),
    CREDIT_CARD_YAPI_KREDI("Credit_Car_Yapi_Kredi"),
    CREDIT_CARD_IS_BANKASI("Credit_Card_Is_Bankasi"),
    CREDIT_ING("Credit_Card_Ing");


    private final String paymentChannel;
    PaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    @Override
    public String toString(){return paymentChannel;}


}
