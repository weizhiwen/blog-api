package com.shixin.blog.domain.common;

import java.io.Serializable;

import lombok.Data;

/**
 * 分页查询类
 * @author weizhiwen
 */
@Data
public class PageQuery<T> implements Serializable {
    private static final long serialVersionUID = -2050188223628060406L;
    /**
     * 当前页数
     */
    private Integer pageNo = 1;
    /**
     * 每页的条数
     */
    private Integer pageSize = 10;
    /**
     * 动态查询条件
     */
    private T query;
}
