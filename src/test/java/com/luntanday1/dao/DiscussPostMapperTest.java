package com.luntanday1.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DiscussPostMapperTest {
    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Test
    public void DiscussPostMapperTest(){
        int row = discussPostMapper.selectDiscussPostRows(101);
        System.out.println(row);
    }


}