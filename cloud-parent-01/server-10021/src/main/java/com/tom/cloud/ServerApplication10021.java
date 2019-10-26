package com.tom.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ServerApplication10021
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 16:04
 */
@MapperScan(value = "com.tom.cloud.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class ServerApplication10021 {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication10021.class,args);
    }
}
