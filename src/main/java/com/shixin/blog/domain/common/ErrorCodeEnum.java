package com.shixin.blog.domain.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * 错误码枚举类
 *
 * @author weizhiwen
 */
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {
    // 0*** 成功
    SUCCESS("0000", "操作成功"),
    // 1*** 参数异常
    PARAM_ERROR("1001", "参数异常"),
    // 2*** 业务异常
    XXX("2001", "业务异常"),
    // 3*** 系统异常
    SYSTEM_ERROR("3001", "服务异常"),
    UNKNOWN_ERROR("3002", "未知异常"),
    ;
    /**
     * 错误编码
     */
    private String code;
    /**
     * 错误消息
     */
    private String message;
}
