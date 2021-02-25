package com.x.ms.plugin.feign.balancer;

import com.x.ms.plugin.feign.properties.MSPluginFeignProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.Request;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.cloud.loadbalancer.core.RoundRobinLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import reactor.core.publisher.Mono;

/**
 * 根据灰度配置完成灰度插件负载均衡
 */
@Slf4j
public class MSPluginFeignRibbonBalancer extends RoundRobinLoadBalancer {

    private MSPluginFeignProperties msPluginFeignProperties;

    public MSPluginFeignRibbonBalancer(MSPluginFeignProperties msPluginFeignProperties, ObjectProvider<ServiceInstanceListSupplier> serviceInstanceListSupplierProvider, String serviceId) {
        super(serviceInstanceListSupplierProvider, serviceId);
        this.msPluginFeignProperties = msPluginFeignProperties;
    }

    public MSPluginFeignRibbonBalancer(MSPluginFeignProperties msPluginFeignProperties, ObjectProvider<ServiceInstanceListSupplier> serviceInstanceListSupplierProvider, String serviceId, int seedPosition) {
        super(serviceInstanceListSupplierProvider, serviceId, seedPosition);
        this.msPluginFeignProperties = msPluginFeignProperties;
    }

    @Override
    public Mono<Response<ServiceInstance>> choose(Request request) {
        // TODO
        return super.choose(request);
    }
}
