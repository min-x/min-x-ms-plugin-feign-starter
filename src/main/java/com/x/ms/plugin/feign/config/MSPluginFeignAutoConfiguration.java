package com.x.ms.plugin.feign.config;

import com.x.ms.plugin.feign.properties.MSPluginFeignProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 根据注释proxyBeanMethods是为了让使用@Bean注解的方法被代理而实现bean的生命周期的行为。
 * 1.设置为true，那么直接调用方法获取bean，不会创建新的bean，而是会走bean的生命周期的行为。
 * 2.设置为false, 那么直接调用方法获取bean，会创建新的bean，且不会走bean的生命周期的行为。
 */
@Configuration(
        proxyBeanMethods = false
)
@EnableConfigurationProperties(MSPluginFeignProperties.class)
@ConditionalOnProperty(name = "ms.plugin.feign.enable", matchIfMissing = true, havingValue = "true")
public class MSPluginFeignAutoConfiguration {
    // TODO
}
