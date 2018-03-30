package com.company.cloudairlineconnectionsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudAirlineConnectionSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudAirlineConnectionSvcApplication.class, args);
	}
}
