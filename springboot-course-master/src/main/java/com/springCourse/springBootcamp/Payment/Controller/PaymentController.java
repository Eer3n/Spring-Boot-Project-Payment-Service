package com.springCourse.springBootcamp.Payment.controller;

import com.springCourse.springBootcamp.Payment.Dto.PaymentRequest;
import com.springCourse.springBootcamp.Payment.Service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
@RequiredArgsConstructor
@Slf4j
public class PaymentController {
    private final PaymentService paymentService;

    @RequestMapping(path = {"/create"}, method = {RequestMethod.POST})
    @ResponseStatus(HttpStatus.CREATED)
    public void createPayment(@RequestBody PaymentRequest paymentRequest) {
        paymentService.createNewPayment(paymentRequest);
    }

    @RequestMapping(path = {"/delete"}, method = {RequestMethod.POST})
    public void deletePayment(@RequestBody PaymentRequest paymentRequest) {
        paymentService.deletePaymentRecord(paymentRequest);
    }
}
