package com.cg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.cg.demo.all")
@SpringBootApplication
public class MicroserviceSecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSecondApplication.class, args);
	}
}
