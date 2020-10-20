package com.example.web.weatherapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.web.weatherapi.model.WeatherModel;

@RestController
class WeatherController {

	private final String baseUrl = "https://fcc-weather-api.glitch.me/api/current?";

	private static final Logger log = LoggerFactory.getLogger(WeatherController.class);

//	@Autowired
//	private RestTemplate rt;

	@Autowired
	private WebClient webClient;

	@RequestMapping(path = "/")
	public String greeting() {
		log.info("Greetings, from Weather Controller");
		return "Greetings, from Weather Controller";
	}

	@GetMapping(path = "/{lat}/{lon}", produces = MediaType.APPLICATION_JSON_VALUE)
	WeatherModel responseData(	@PathVariable("lat") long lat, 
								@PathVariable("lon") long lon) {
		String uri = String.format(this.baseUrl + "lat=" + lat + "&lon=" + lon);
		log.info("Calling " + uri);
		
		// return rt.getForObject(this.baseUrl+"lat="+lat+"&lon="+lon,
		// WeatherModel.class);

		return this.webClient
				.get()
				.uri(uri)
				.retrieve()
				.bodyToMono(WeatherModel.class)
				.block();

	}
}
