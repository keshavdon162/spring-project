package com.cognizant.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")//scans the base packages for the class
public class HcscDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcscDashboardApplication.class, args);
	}

}
