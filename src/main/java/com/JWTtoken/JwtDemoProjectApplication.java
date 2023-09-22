package com.JWTtoken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class JwtDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoProjectApplication.class, args);
	}

}
