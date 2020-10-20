package com.example.web.weatherapi.service;

import com.example.web.weatherapi.model.WeatherModel;

public interface WeatherService {

	public WeatherModel getWeather(long lat, long lon);
	
}
