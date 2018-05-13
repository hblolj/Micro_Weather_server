package com.hblolj.msaweatherreportserver.service;

import com.hblolj.msaweatherreportserver.vo.City;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author: hblolj
 * @Date: 2018/5/13 16:26
 * @Description:
 * @Version: 1.0
 **/
@FeignClient("micro-weather-city-client")
public interface WeatherCityService {

    /**
     * 从城市微服务获取城市列表信息
     * @return
     */
    @GetMapping("/weather-city-server/cities/list")
    List<City> listCity();
}
