package com.x.ms.plugin.feign.interceptor;

import com.x.ms.plugin.feign.properties.MSPluginFeignProperties;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 设置请求的header中的服务分组标记，用于下一个调用服务获取服务分组标记
 */
@Slf4j
@AllArgsConstructor
public class MSPluginFeignInterceptor implements RequestInterceptor {

    private MSPluginFeignProperties msPluginFeignProperties;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        // TODO
    }
}
