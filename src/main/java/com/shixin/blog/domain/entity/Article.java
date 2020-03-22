package com.shixin.blog.domain.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 博客文章实体类
 *
 * @author weizhiwen
 */
@Data
@Entity
public class Article {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 标题
     */
    @Column
    private String title;
    /**
     * 内容
     */
    @Column
    private String content;
    /**
     * 是否展示
     */
    @Column(name = "is_show", columnDefinition = "tinyint", length = 1)
    private Boolean show;
    /**
     * 文章类型ID
     */
    @Column
    private String typeId;
}
