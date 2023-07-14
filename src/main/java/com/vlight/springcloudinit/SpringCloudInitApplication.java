package com.vlight.springcloudinit;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringCloudInitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudInitApplication.class, args);
	}

	@GetMapping("hello")
	public String hello() {
		return "hello";
	}
}
