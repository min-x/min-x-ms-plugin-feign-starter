
[项目GitHub链接](https://github.com/min-x/min-x-ms-plugin-feign-starter)

本项目是以[min-x-boot](https://github.com/min-x/min-x-boot) 为基础依赖，用于Spring Cloud微服务，服务间相互调用，自定义请求分组与负载均衡的AB插件。

## 项目使用
1.目前项目未上传到maven repository，使用请install打包到本地使用。

2.maven使用，请添加如下配置：
```aidl
<dependency>
    <groupId>com.x</groupId>
    <artifactId>min-x-ms-plugin-feign-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```
3.插件定义规范
```aidl
balancer:定义负载均衡，规定分组下使用不同的负载均衡策略。
config:自动装配配置，里面有各个模块生效的配置。
context：定义请求context，用于当前请求的内容传递。
filter：获取来自其他服务/ngx的请求分组内容，并设置到context。
interceptor：设置请求服务的分组信息等，用于下一个服务的filter获取请求分组内容。
properties：定义配置内容，包含开发者定义与获取的分组信息
```

## Reference
> 版本V1.0.0
>> 更新时间2021年02月25日
>
>> 1.基于min-x-boot 2.4.2  
>> 2.增加基础骨架