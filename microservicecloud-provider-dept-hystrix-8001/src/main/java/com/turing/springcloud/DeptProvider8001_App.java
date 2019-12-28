package com.turing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient	//本服务启动后会注册到注册中心
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker	//对hystrix熔断机制的实现
public class DeptProvider8001_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_App.class, args);
	}
}
