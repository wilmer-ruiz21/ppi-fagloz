package com.ppi.fagloz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FaglozApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaglozApplication.class, args);
	}

}
