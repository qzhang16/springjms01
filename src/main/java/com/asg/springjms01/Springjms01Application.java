package com.asg.springjms01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Springjms01Application {

	public static void main(String[] args) {
		SpringApplication.run(Springjms01Application.class, args);

		

	}

}
