package com.luntanday1.dao;

import com.luntanday1.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;




@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void UserMapperTest(){
        User user = userMapper.selectByName("system");
        System.out.println(user);
    }

}