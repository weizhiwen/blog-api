package com.shixin.blog.domain.common;

import java.io.Serializable;

import lombok.Data;

/**
 * 统一的响应结果返回实体类
 *
 * @author weizhiwen
 */
@Data
public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = -2982887714226822533L;
    /**
     * 响应是否成功
     */
    private Boolean success;
    /**
     * 响应码
     */
    private String code;
    /**
     * 响应消息
     */
    private String message;
    /**
     * 响应数据
     */
    private T data;

    /**
     * 成功响应返回结果
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> success(T data) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setSuccess(Boolean.TRUE);
        responseResult.setData(data);
        return responseResult;
    }

    /**
     * 失败响应返回结果
     *
     * @param code
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> fail(String code, String message) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setSuccess(Boolean.FALSE);
        responseResult.setCode(code);
        responseResult.setMessage(message);
        return responseResult;
    }
}
