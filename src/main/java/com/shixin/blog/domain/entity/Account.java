package com.shixin.blog.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * 个人账号实体类
 * @author weizhiwen
 */
@Data
@Entity
public class Account {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 名称
     */
    @Column
    private String name;
    /**
     * 图片
     */
    @Column
    private String image;
    /**
     * 地址
     */
    @Column
    private String url;
}
