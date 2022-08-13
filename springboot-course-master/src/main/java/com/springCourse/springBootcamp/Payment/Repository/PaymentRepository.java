package com.springCourse.springBootcamp.Payment.Repository;

import com.springCourse.springBootcamp.Payment.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    @Query("select payment from Payment payment where payment.transactionNumber=:transactionNumber")
    Payment findPaymentByTransactionNumber(@Param("transactionNumber") Long transactionNumber);

    @Query("select payment from Payment payment where payment.Id=:Id")
    Payment findPaymentById(@Param("Id") Long Id);
}
