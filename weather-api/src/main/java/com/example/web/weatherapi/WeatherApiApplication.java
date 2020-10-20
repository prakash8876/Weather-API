package com.example.web.weatherapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EntityScan
public class WeatherApiApplication {

	@Bean
	public WebClient webClient(WebClient.Builder builder) {
		//WebClient.Builder builder = WebClient.builder();
		return builder.build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WeatherApiApplication.class, args);
	}
	
	
//	@Bean
//	public RestTemplate rt(RestTemplateBuilder builder) {
//		return builder.build();
//	} 
}
