package org.algo.invest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AlgoInvestApp {
	
	public static void main(String[] args) {
		
		SpringApplicationBuilder app = new SpringApplicationBuilder(AlgoInvestApp.class);
		app.build().addListeners(new ApplicationPidFileWriter("./bin/shutdown.pid"));
		app.run();

	}
	
}
