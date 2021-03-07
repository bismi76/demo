package com.artnest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ArtnestEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(ArtnestEurekaServer.class, args);
	}

}
