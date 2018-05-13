package com.hblolj.msaweatherreportserver.service;

import com.hblolj.msaweatherreportserver.vo.WeatherResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: hblolj
 * @Date: 2018/5/13 16:32
 * @Description:
 * @Version: 1.0
 **/
@FeignClient("micro-weather-data-client")
public interface WeatherDataService {

    @GetMapping("/weather-data-server/cityId/{cityId}")
    WeatherResponse getWeatherByCityId(@PathVariable("cityId") String cityId);
}
