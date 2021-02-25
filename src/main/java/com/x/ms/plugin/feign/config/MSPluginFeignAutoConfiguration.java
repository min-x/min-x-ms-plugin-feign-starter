package com.x.ms.plugin.feign.config;

import com.x.ms.plugin.feign.properties.MSPluginFeignProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(MSPluginFeignProperties.class)
@ConditionalOnProperty(name = "ms.plugin.feign.enable", matchIfMissing = true, havingValue = "true")
public class MSPluginFeignAutoConfiguration {
    // TODO
}
