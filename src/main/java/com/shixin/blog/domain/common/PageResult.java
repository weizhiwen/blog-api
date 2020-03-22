package com.shixin.blog.domain.common;

import java.io.Serializable;

import lombok.Data;

/**
 * 分页查询返回实体类
 *
 * @author weizhiwen
 */
@Data
public class PageResult<T> implements Serializable {
    private static final long serialVersionUID = 3549407820405432075L;
    /**
     * 当前页号
     */
    private Integer pageNo;
    /**
     * 每页行数
     */
    private Integer pageSize;
    /**
     * 总条数
     */
    private Integer totalSize;
    /**
     * 总页数
     */
    private Integer pageNum;

    /**
     * 数据
     */
    private T data;

}
