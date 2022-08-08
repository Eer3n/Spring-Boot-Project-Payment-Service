package com.springCourse.springBootcamp.User.Dao;

import com.springCourse.springBootcamp.User.CreditStatus.CreditStatus;
import com.springCourse.springBootcamp.User.Entity.User;
import com.springCourse.springBootcamp.User.Gender.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    @Query("select user from User user")
    List<User> findAll();

    @Query("select user from User user where user.Id=:Id")
    User findAllById(@Param("Id") Long Id);

    @Query("select user from User user where user.name=:name and user.surname=:surname")
    User findAllByNameAndSurname(@Param("name")String name, @Param("surname")String surname);

    @Query("select user from User user where user.mailAddress=:mailAddress and user.password=:password")
    User findAllByMailAddressAndPassword(@Param("mailAddress") String mailAddress,@Param("password") String password);

    @Query("select user from User user where user.identityNumber=:identityNumber and user.age=:age")
    User findAllByIdentityNumberAndAge(@Param("identityNumber") int identityNumber,@Param("age") int age);

    @Query("select user from User user where user.creditScore=:creditScore")
    User findAllByCreditScore(@Param("creditScore") int creditScore);

    @Query("select user from User user where user.gender=:gender")
    User findAllByGender(@Param("gender") Gender gender);

    @Query("select user from User user where user.creditScore=:creditScore")
    User findAllByCreditStatus(@Param("creditStatus")CreditStatus creditStatus);

    User save(User user);

    @Query("delete from User user where user.Id=:Id")
    void deleteAllById(@Param("userId") Long Id);


}
