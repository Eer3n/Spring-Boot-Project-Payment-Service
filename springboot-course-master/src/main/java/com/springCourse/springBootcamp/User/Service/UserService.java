package com.springCourse.springBootcamp.User.Service;

import com.springCourse.springBootcamp.User.CreditStatus.CreditStatus;
import com.springCourse.springBootcamp.User.Dao.UserDao;
import com.springCourse.springBootcamp.User.Entity.User;
import com.springCourse.springBootcamp.User.Gender.Gender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findAllById(Long Id) {
        return userDao.findAllById(Id);
    }

    public User createNewUser(User user) {
        return userDao.save(user);
    }

    public User findAllByNameAndSurname(String name, String surname) {
        return userDao.findAllByNameAndSurname(name, surname);
    }

    public User findAllByMailAddressAndPassword(String mailAddress, String password){
        return userDao.findAllByMailAddressAndPassword(mailAddress, password);
    }

    public User findAllByIdentityNumberAndAge(int identityNumber, int age){
        return userDao.findAllByIdentityNumberAndAge(identityNumber, age);
    }

    public User findAllByGender(Gender gender){
        return userDao.findAllByGender(gender);
    }

    public User findAllByCreditStatus(CreditStatus creditStatus){
        return userDao.findAllByCreditStatus(creditStatus);
    }

    public User findAllByCreditScore(int creditScore){
        return userDao.findAllByCreditScore(creditScore);
    }


    public void deleteGivenUser(User user) {
        userDao.delete(user);
    }



}
