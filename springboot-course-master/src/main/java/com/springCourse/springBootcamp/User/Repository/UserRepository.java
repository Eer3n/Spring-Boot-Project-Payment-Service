package com.springCourse.springBootcamp.User.Repository;

import com.springCourse.springBootcamp.User.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select user from User user where user.Id=:Id")
    User findUserById(@Param("Id") Long Id);

    @Query("delete from User user where user.Id=:Id")
    User deleteUserById(@Param("Id") Long Id);


}
