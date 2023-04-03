package com.build.sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.build.sys.mapper")
public class SysCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysCloudApplication.class, args);
    }


}
