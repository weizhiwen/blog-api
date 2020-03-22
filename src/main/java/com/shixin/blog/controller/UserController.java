package com.shixin.blog.controller;

import com.shixin.blog.domain.common.ResponseResult;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author weizhiwen
 */
@RestController
@Api("用户相关")
public class UserController {
    @ApiOperation("测试")
    public ResponseResult<String> test(String content) {
        return ResponseResult.success(content);
    }
}
