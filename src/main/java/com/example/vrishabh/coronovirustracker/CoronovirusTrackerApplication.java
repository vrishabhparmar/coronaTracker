package com.example.vrishabh.coronovirustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CoronovirusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronovirusTrackerApplication.class, args);
	}

}
