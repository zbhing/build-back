package com.build.bus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.build.bus.mapper")
public class SysCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysCloudApplication.class, args);
    }


}
