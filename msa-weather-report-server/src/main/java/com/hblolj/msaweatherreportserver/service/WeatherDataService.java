package com.hblolj.msaweatherreportserver.service;

import com.hblolj.msaweatherreportserver.service.impl.WeatherDataFallBack;
import com.hblolj.msaweatherreportserver.vo.City;
import com.hblolj.msaweatherreportserver.vo.WeatherResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author: hblolj
 * @Date: 2018/5/13 16:32
 * @Description:
 * @Version: 1.0
 **/
@FeignClient(name = "micro-weather-eureka-client-zuul", fallback = WeatherDataFallBack.class)
public interface WeatherDataService {

    /**
     * 从路由服务获取城市列表信息
     * @return
     */
    @GetMapping("/client-zuul/weather-city-server/cities/list")
    List<City> listCity();

    /**
     * 从路由服务按城市 Id 获取城市天气信息
     * @param cityId
     * @return
     */
    @GetMapping("/client-zuul/weather-data-server/cityId/{cityId}")
    WeatherResponse getWeatherByCityId(@PathVariable("cityId") String cityId);
}
