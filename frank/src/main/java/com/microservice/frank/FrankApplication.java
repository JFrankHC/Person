package com.microservice.frank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FrankApplication {

	@GetMapping("/weatherForecast")
	public String getMessage() {
		return "Today is a great sunny day for a Java service";
	}
	public static void main(String[] args) {
		SpringApplication.run(FrankApplication.class, args);
	}

}
