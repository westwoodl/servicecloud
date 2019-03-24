package com.xu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MyZuul_9527 {
    public static void main(String[] args){
        SpringApplication.run(MyZuul_9527.class, args);
    }
}
