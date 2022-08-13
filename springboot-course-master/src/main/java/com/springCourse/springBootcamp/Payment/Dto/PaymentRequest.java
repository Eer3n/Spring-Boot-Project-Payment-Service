package com.springCourse.springBootcamp.Payment.Dto;

import com.springCourse.springBootcamp.Payment.Enum.PaymentChannel;
import com.springCourse.springBootcamp.Payment.Enum.PaymentInstallment;
import com.springCourse.springBootcamp.Payment.Enum.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {
    private Long Id;
    private Long transactionNumber;
    private Long userId;
    double amount;
    private PaymentChannel paymentChannel;
    private PaymentType paymentType;
    private PaymentInstallment paymentInstallment;
    Date insDate;
}
