package com.nina.app.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloNinaService {
    /**
     * @RestController 与Controller的区别
     * 如果在类上加@RestController，该类中所有SpringMVCUrl接口映射都是返回json格式
     * 在每个方法上加上@ResponseBody注解 返回json格式
     * 是SpringMVC提供 而不是Springboot提供
     *
     * Rest 微服务接口开发中 Rest风格 数据传输风格json格式 协议http协议
     *
     * Controller 控制层注解 SpringMVCUrl接口映射 默认情况下返回页面跳转 如果需要返回json格式的情况
     * 需要加@ResponseBody注解
     */

    @RequestMapping("/getInf")
    public String getInf(){
        return "nina";
    }

}
