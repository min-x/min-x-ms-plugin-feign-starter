package com.x.ms.plugin.feign.filter;

import com.x.ms.plugin.feign.properties.MSPluginFeignProperties;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;

import javax.servlet.*;
import java.io.IOException;

/**
 * 提取上一个服务/ngx请求过来的header中包含的服务分组标记
 */
@Slf4j
@AllArgsConstructor
public class MSPluginFeignFilter implements Filter, Ordered {

    private MSPluginFeignProperties msPluginFeignProperties;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // TODO
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }

}
