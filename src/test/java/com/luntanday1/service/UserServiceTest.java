package com.luntanday1.service;

import com.luntanday1.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;
    
    
    @Test
    public void UserServiceTest(){
        User userById = userService.findUserById(11);
        System.out.println(userById);
    }

}