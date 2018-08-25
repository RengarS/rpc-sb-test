package com.aries.rpcsbtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@ComponentScan("com.aries")
@MapperScan("com.aries.rpcsbtest.mapper")
public class RpcSbTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpcSbTestApplication.class, args);
    }
}
