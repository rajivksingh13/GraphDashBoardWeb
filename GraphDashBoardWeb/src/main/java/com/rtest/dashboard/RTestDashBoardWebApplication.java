package com.rtest.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.rtest.*" })
public class RTestDashBoardWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RTestDashBoardWebApplication.class, args);
	}

}
