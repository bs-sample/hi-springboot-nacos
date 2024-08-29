package net.hifor.demo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IKin <br/>
 * @description 第一个springboot  <br/>
 * @date 2019/11/17 <br/>
 */
@RestController
public class HelloSpringbootController {

    @NacosValue(value = "${abc:null}", autoRefreshed = true)
    private String abc;

    @NacosValue(value = "${test}", autoRefreshed = true)
    private String test;

    @NacosValue(value = "${ref-back:null}", autoRefreshed = true)
    private String ref_back;

    @NacosValue(value = "${ref-pre:null}", autoRefreshed = true)
    private String ref_pre;

    @NacosValue(value = "${ref-application:null}", autoRefreshed = true)
    private String ref_application;

    /**
     * 获取的是操作系统的环境变量，不会被Nacos配置覆盖
     */
    @NacosValue(value = "${username}", autoRefreshed = true)
    private String username;

    @Value("${var.java-home}")
    private String envJavaHome;

    /**
     * 第一个方法
     *
     * @return
     */
    @GetMapping("/")
    public String hello() {
        return "Hello Spring boot!"
                + "<br/>environment.javaHome: " + envJavaHome
                + "<br/>nacos-config-a.yml abc: " + abc
                + "<br/>nacos-config-a.yml test: " + test
                + "<br/>username: " + username
                + "<br/>ref-back: " + ref_back
                + "<br/>ref-pre: " + ref_pre
                + "<br/>ref-application: " + ref_application
                ;
    }
}
