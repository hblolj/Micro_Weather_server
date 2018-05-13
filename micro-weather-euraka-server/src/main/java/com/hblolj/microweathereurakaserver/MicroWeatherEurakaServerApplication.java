package com.hblolj.microweathereurakaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroWeatherEurakaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroWeatherEurakaServerApplication.class, args);
	}
}
