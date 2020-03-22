package com.shixin.blog.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserDaoTests {
    @Autowired
    UserDao userDao;

    @Test
    void test1() {
        System.out.println(userDao.findAll());
    }

}
