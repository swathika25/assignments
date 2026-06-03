package com.wipro.transactioneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication

public class TransactionEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionEurekaApplication.class, args);
	}

}
