package com.xu.springcloud;

import com.xu.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//???? 加了这个我才运行成功
@RibbonClient(value = "servicecloud-dept", configuration = MyRule.class)
public class App {//消費者 80

    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}
