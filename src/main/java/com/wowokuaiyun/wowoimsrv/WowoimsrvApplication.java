package com.wowokuaiyun.wowoimsrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching     //缓存
@SpringBootApplication
@ServletComponentScan   //启动器启动时，扫描本目录以及子目录带有的webservlet注解的
public class WowoimsrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(WowoimsrvApplication.class, args);
    }
}
