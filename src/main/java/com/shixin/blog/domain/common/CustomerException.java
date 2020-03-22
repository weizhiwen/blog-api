package com.shixin.blog.domain.common;

import lombok.Getter;

/**
 * 自定义异常类
 *
 * @author weizhiwen
 */
public class CustomerException extends RuntimeException {
    /**
     * 错误码
     */
    @Getter
    private String code;

    public CustomerException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.code = errorCodeEnum.getCode();
    }

    public CustomerException(String code, String message) {
        super(message);
        this.code = code;
    }


    public CustomerException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}
