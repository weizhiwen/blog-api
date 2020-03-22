package com.shixin.blog.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArticleDaoTests {
    @Autowired
    ArticleDao articleDao;

    @Test
    void test1() {
        System.out.println(articleDao.findAll());
    }

}
