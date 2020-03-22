package com.shixin.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger2配置类
 *
 * @author weizhiwen
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    /**
     * Swagger2 信息
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                // API基本信息
                .apiInfo(createApiInfo())
                // 设置允许暴露的接口
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.shixin.blog.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * API基本信息
     *
     * @return
     */
    public ApiInfo createApiInfo() {
        return new ApiInfoBuilder()
                .title("个人博客")
                .description("个人博客后端接口API文档")
                .contact(new Contact("士心", "", ""))
                .version("1.0.0")
                .build();
    }
}
