package com.hblolj.mircoweathereurekaclientzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class MircoWeatherEurekaClientZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MircoWeatherEurekaClientZuulApplication.class, args);
	}
}
