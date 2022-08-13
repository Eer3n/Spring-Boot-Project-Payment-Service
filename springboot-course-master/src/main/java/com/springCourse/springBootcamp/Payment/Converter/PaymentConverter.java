package com.springCourse.springBootcamp.Payment.Converter;

import com.springCourse.springBootcamp.Payment.Dto.PaymentRequest;
import com.springCourse.springBootcamp.Payment.Entity.Payment;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PaymentConverter {
    public Payment convertFromRequest(PaymentRequest paymentDto) {
        return Payment.builder()
                .Id(paymentDto.getId())
                .transactionNumber(paymentDto.getTransactionNumber())
                .userId(paymentDto.getUserId())
                .amount(paymentDto.getAmount())
                .paymentChannel(paymentDto.getPaymentChannel())
                .paymentType(paymentDto.getPaymentType())
                .paymentInstallment(paymentDto.getPaymentInstallment())
                .insDate(paymentDto.getInsDate())
                .build();
    }
}
