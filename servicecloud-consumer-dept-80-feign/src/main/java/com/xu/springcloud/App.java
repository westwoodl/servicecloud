package com.xu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient//???? 加了这个我才运行成功
@EnableFeignClients(basePackages= {"com.xu.springcloud"})
@ComponentScan("com.xu.springcloud")
public class App {//消費者 80

    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}
