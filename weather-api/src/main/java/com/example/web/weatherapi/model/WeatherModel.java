package com.example.web.weatherapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class WeatherModel {

	private Coord coord;
	
	private Weather[] weather;
	
	private String base;
	
	private Main main;
	
	private Long visibility;
	
	private Wind wind;
	
	private Clouds clouds;
	
	private Long dt;
	
	private Sys sys;
	
	private Long timezone;
	
	private Long id;
	
	private String name;
	
	private Long cod;
	
	public WeatherModel() {
		// TODO Auto-generated constructor stub
	}

	public WeatherModel(Coord coord, Weather[] weather, String base, Main main, Long visibility, Wind wind,
			Clouds clouds, Long dt, Sys sys, Long timezone, Long id, String name, Long cod) {
		super();
		this.coord = coord;
		this.weather = weather;
		this.base = base;
		this.main = main;
		this.visibility = visibility;
		this.wind = wind;
		this.clouds = clouds;
		this.dt = dt;
		this.sys = sys;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.cod = cod;
	}
	
	
	
}
