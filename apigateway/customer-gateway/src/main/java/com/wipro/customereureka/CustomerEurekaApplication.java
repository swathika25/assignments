package com.wipro.customereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class CustomerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerEurekaApplication.class, args);
	}

}
