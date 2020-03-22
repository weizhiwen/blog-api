package com.shixin.blog.dao;

import com.shixin.blog.domain.entity.Article;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author weizhiwen
 */
public interface ArticleDao extends JpaRepository<Article, Long> {
}
