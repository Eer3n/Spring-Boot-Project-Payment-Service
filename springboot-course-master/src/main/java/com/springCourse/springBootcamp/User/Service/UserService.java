package com.springCourse.springBootcamp.User.Service;


import com.springCourse.springBootcamp.Payment.Entity.Payment;
import com.springCourse.springBootcamp.Payment.Enum.PaymentStatus;
import com.springCourse.springBootcamp.User.Entity.User;
import com.springCourse.springBootcamp.User.Enum.UserStatus;
import com.springCourse.springBootcamp.User.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;


    public User findUserById(Long Id) {
        return userRepository.findUserById(Id);
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public void delete(User user){
        userRepository.delete(user);
    }

    public void setUserStatusDependingOnUnpaidPayments(User user){
        List<Payment> paymentList = user.getPaymentList();

        int counter = 0;
        for (var payment: paymentList){
            if (PaymentStatus.UNPAID == payment.getPaymentStatus()){
                counter += 1;
            }
        }
        if (counter >= 5){
            user.setUserStatus(UserStatus.REVOKED);
            save(user);
        }
    }
}
