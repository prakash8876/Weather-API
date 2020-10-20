package com.example.web.weatherapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main {
	private Double temp;
	private Double feels_like;
	private Double temp_min;
	private Double temp_max;
	private Long pressure;
	private Long humidity;
	private Long sea_level;
	private Long grnd_level;
}
