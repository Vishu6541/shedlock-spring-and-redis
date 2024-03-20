package com.vishu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShedLookSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShedLookSchedulerApplication.class, args);
	}

}
