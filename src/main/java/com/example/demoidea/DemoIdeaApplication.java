package com.example.demoidea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoIdeaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIdeaApplication.class, args);
	}

	@Bean
	public RestTemplate template(){
		return new RestTemplateBuilder().build();
	}

}
