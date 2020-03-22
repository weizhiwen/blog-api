package com.shixin.blog.handler;

import com.shixin.blog.domain.common.CustomerException;
import com.shixin.blog.domain.common.ResponseResult;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

/**
 * 全局异常处理器
 * @author weizhiwen
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 自定义异常处理器
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(CustomerException.class)
    public ResponseResult customerExceptionHandler(CustomerException e) {
        log.error("捕获到自定义异常", e);
        return ResponseResult.fail(e.getCode(), e.getMessage());
    }

    /**
     * 运行时异常处理器
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public ResponseResult customerExceptionHandler(RuntimeException e) {
        log.error("捕获到运行时异常", e);
        return ResponseResult.fail("0", e.getMessage());
    }

    /**
     * 系统级异常处理器
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(Throwable.class)
    public ResponseResult customerExceptionHandler(Throwable e) {
        log.error("捕获到运行时异常", e);
        return ResponseResult.fail("0", e.getMessage());
    }

}
