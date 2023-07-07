package com.ruoyi.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName RuoYiGatewayApplication
 * @Description TODO
 * @Author JiangXiong
 * @Date 2023/7/5 17:20
 * @Version 1.0
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class RuoYiGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RuoYiGatewayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  若依测试网关启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
