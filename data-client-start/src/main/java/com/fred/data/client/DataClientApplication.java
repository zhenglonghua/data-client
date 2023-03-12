package com.fred.data.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@Enab
public class DataClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataClientApplication.class, args);
	}

}
