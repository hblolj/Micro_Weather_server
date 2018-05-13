package com.hblolj.microweathereurakaclient.config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: hblolj
 * @Date: 2018/5/13 15:59
 * @Description:
 * @Version: 1.0
 **/
@FeignClient("micro-weather-city-client")
public interface CityClient {

    @GetMapping("/cities/list")
    String listCity();
}
