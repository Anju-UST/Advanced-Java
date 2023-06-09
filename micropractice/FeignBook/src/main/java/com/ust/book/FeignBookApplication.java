package com.ust.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FeignBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignBookApplication.class, args);
	}

}
