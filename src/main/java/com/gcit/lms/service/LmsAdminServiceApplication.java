package com.gcit.lms.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.gcit.lms")
//@EnableJpaRepositories
public class LmsAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsAdminServiceApplication.class, args);
	}

}
