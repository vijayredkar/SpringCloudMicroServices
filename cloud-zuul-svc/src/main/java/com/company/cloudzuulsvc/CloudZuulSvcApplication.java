package com.company.cloudzuulsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/*
https://exampledriven.wordpress.com/2016/07/06/spring-cloud-zuul-example/
https://thepracticaldeveloper.com/2017/06/27/hystrix-fallback-with-zuul-and-spring-boot/	
*/	

@SpringBootApplication
@EnableZuulProxy
public class CloudZuulSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZuulSvcApplication.class, args);
	}
}
