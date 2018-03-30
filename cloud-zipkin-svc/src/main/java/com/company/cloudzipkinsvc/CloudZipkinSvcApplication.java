package com.company.cloudzipkinsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class CloudZipkinSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZipkinSvcApplication.class, args);
	}
}
