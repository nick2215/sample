package com.nick.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value(value = "${app.base-package}")
    String basePackage;

    @Bean
    public Docket docket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).pathMapping("/").select()
                .apis(RequestHandlerSelectors.basePackage(basePackage)).paths(PathSelectors.any()).build();
        return docket;
    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("新媒体统计功能文档").description("该工程用于完成新媒体各种统计任务")
                .termsOfServiceUrl("http://www.haoban173.com/").build();
    }

    @Bean
    public UiConfiguration uiConfiguration() {
        return new UiConfiguration("validatorUrl", // url
                "list", // docExpansion          => none | list
                "alpha", // apiSorter             => alpha
                "model", // defaultModelRendering => schema | model
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, false, // enableJsonEditor      => true | false
                true, // showRequestHeaders    => true | false
                120000L); // requestTimeout => in milliseconds, defaults to null (uses jquery xh  
    }
}
