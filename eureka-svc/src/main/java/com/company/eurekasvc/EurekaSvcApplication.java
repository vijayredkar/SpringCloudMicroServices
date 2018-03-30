package com.company.eurekasvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSvcApplication.class, args);
	}
}
