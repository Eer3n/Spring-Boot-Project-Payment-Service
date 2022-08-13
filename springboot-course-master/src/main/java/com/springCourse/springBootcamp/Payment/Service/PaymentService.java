package com.springCourse.springBootcamp.Payment.Service;

import com.springCourse.springBootcamp.Payment.Converter.PaymentConverter;
import com.springCourse.springBootcamp.Payment.Dto.PaymentRequest;
import com.springCourse.springBootcamp.Payment.Entity.Payment;
import com.springCourse.springBootcamp.Payment.Repository.PaymentRepository;
import com.springCourse.springBootcamp.User.Entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public Payment createNewPayment(PaymentRequest paymentRequest) {
        log.info("payment with id {} and transaction number {} created", paymentRequest.getId(),
                paymentRequest.getTransactionNumber());
        return paymentRepository.save(PaymentConverter.convertFromRequest(paymentRequest));
    }

    public void deletePaymentRecord(PaymentRequest paymentRequest) {
        log.info("payment with id {} and transaction number {} deleted", paymentRequest.getId(),
                paymentRequest.getTransactionNumber());
        paymentRepository.delete(PaymentConverter.convertFromRequest(paymentRequest));
    }

    public Payment findPaymentWithId(Long id) {
        return paymentRepository.findPaymentById(id);
    }

    public Payment findPaymentByTransactionId(Long transactionId) {
        return paymentRepository.findPaymentByTransactionNumber(transactionId);
    }

    public void setUserStatus(User user) {

    }
}
