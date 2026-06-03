package com.wipro.accounteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class AccountEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountEurekaApplication.class, args);
	}

}
