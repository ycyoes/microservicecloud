package com.turing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer	//EurekaServer服务器端启动类，接受其他微服务注册
public class Config_Git_EurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
	}
}
