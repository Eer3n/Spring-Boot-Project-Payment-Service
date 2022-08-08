package com.springCourse.springBootcamp.User.Controller;

import com.springCourse.springBootcamp.User.Exception.UserNotFoundException;
import com.springCourse.springBootcamp.User.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.springCourse.springBootcamp.User.Entity.User;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/find-all")
    public List<User> findAllUsers(){return userService.findAll();}

    @GetMapping("/{Id}")
    public User findUserById(@PathVariable Long Id){ return userService.findAllById(Id);}

    @GetMapping("/{mailAddress}/{password}")
    public User findAllByMailAddressAndPassword(@PathVariable String mailAddress, @PathVariable String password) throws
            Exception{
        User user = userService.findAllByMailAddressAndPassword(mailAddress,password);
        if (user== null){
            throw new UserNotFoundException("User Not Found!");
        }
        return user;
    }

    @PostMapping("/create")
    public void save(@RequestBody User user){userService.createNewUser(user);}

    @PostMapping("/delete")
    public void delete(@RequestBody User user){userService.deleteGivenUser(user);}

}
