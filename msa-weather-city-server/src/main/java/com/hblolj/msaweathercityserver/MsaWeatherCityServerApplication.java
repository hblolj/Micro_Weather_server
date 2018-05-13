package com.hblolj.msaweathercityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaWeatherCityServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaWeatherCityServerApplication.class, args);
	}
}
