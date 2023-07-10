package com.ruoyi.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author JiangXiong
 * @Date 2023/7/10 11:10
 * @Version 1.0
 */
@RestController
public class TestController
{
    @Value("${ruoyi.name}")
    private String name;

    @Value("${ruoyi.version}")
    private String version;

    @GetMapping("info")
    public String get()
    {
        return name + version;
    }
}