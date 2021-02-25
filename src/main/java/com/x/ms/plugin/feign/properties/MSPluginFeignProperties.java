package com.x.ms.plugin.feign.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = MSPluginFeignProperties.PREFIX)
public class MSPluginFeignProperties {
    public static final String PREFIX = "ms.plugin.feign";

    /**是否启用*/
    private Boolean enabled;
    /**自定义分组名称：默认min-x-group*/
    private String groupName;
    /**
     * 自定义提供服务
     * 格式：serviceProvider=serviceA=192.168.1.100:8080,ServiceB=192.168.1.101:8080,Service=192.168.1.102:8080
     */
    private String serviceProvider;
}
