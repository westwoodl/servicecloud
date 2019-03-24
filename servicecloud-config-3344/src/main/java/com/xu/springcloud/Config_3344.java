package com.xu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Config_3344 {
    public static void main(String[] args){
        SpringApplication.run(Config_3344.class, args);
    }
}