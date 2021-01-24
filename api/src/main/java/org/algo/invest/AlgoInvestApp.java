package org.algo.invest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AlgoInvestApp {
	
	public static void main(String[] args) {
		SpringApplication.run(AlgoInvestApp.class, args);
	}
}
