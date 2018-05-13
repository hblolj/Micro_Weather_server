package com.hblolj.microweathereurakaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MicroWeatherEurakaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroWeatherEurakaClientApplication.class, args);
	}
}
