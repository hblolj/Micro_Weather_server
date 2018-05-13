package com.hblolj.msaweatherdataserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaWeatherDataServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaWeatherDataServerApplication.class, args);
	}
}
