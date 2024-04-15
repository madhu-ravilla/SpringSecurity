package com.madhu.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.madhu")
public class SpringSecurityV01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityV01Application.class, args);
	}

}
