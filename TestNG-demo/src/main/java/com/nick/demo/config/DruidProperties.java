package com.nick.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * 只提供了常用的属性，如果有需要，自己添加
 *
 * @author nick
 * @since 2017/5/31.
 */
@Data
@ConfigurationProperties(prefix = "druid")
public class DruidProperties {
	
    private String url;
    private String username;
    private String password;
    private int maxActive;
    private int minIdle;
    private int initialSize;
    private boolean testOnBorrow;
}
