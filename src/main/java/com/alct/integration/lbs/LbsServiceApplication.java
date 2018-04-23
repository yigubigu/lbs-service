package com.alct.integration.lbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LbsServiceApplication {


	public static void main(String[] args) {

		SpringApplication.run(LbsServiceApplication.class, args);
	}
}
