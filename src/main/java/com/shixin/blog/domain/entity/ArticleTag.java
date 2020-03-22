package com.shixin.blog.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * 文章和标签关联的实体类
 * @author weizhiwen
 */
@Data
@Entity
public class ArticleTag {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 文章ID
     */
    @Column
    private Long articleId;
    @Column
    private Long tagId;
}
