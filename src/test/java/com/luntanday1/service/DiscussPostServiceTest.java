package com.luntanday1.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DiscussPostServiceTest {
    @Autowired
    private DiscussPostService discussPostService;

    @Test
    public void DiscussTest(){
        int rows = discussPostService.findDiscussPostRows(0);
        //查出149条数据
        System.out.println(rows);
    }

}