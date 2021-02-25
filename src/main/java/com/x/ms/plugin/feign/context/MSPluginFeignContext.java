package com.x.ms.plugin.feign.context;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ms-plugin-feign调用上下文
 */
public class MSPluginFeignContext {
    /**
     * 拓展知识：
     * InheritableThreadLocal：保证调用链ID能够自然的在多线程间传递
     */

    /**请求的服务名称*/
    private static final InheritableThreadLocal<String> requestServiceName = new InheritableThreadLocal<>();

    /**请求的服务组名称*/
    private static final InheritableThreadLocal<String> requestGroupName = new InheritableThreadLocal<>();

    /**提供的服务*/
    private static final InheritableThreadLocal<ConcurrentHashMap<String, LinkedList<ServiceInstance>>> serviceProviders = new InheritableThreadLocal<>();

    /**清空Context*/
    public static void removeContext() {
        requestServiceName.remove();
        requestGroupName.remove();
        serviceProviders.remove();
    }

    /**根据Context的RequestServiceName获取提供的服务*/
    public static LinkedList<ServiceInstance> getServiceProviderByServiceName() {
        if (StringUtils.isEmpty(requestServiceName.get()) || CollectionUtils.isEmpty(serviceProviders.get())) {
            return null;
        }
        return serviceProviders.get().get(requestServiceName.get());
    }



    public static String getRequestServiceName() {
        return requestServiceName.get();
    }

    public static void setRequestServiceName(String serviceName) {
        requestServiceName.set(serviceName);
    }

    public static String getRequestGroupName() {
        return requestGroupName.get();
    }

    public static void setRequestGroupName(String serviceName) {
        requestGroupName.set(serviceName);
    }

    public static ConcurrentHashMap<String, LinkedList<ServiceInstance>> getServiceProviders() {
        return serviceProviders.get();
    }

    public static void setServiceProviders(ConcurrentHashMap<String, LinkedList<ServiceInstance>> serviceProvider) {
        serviceProviders.set(serviceProvider);
    }

}
