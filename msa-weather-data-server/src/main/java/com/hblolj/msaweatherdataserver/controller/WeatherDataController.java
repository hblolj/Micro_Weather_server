package com.hblolj.msaweatherdataserver.controller;

import com.hblolj.msaweatherdataserver.service.WeatherDataService;
import com.hblolj.msaweatherdataserver.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author: hblolj
 * @Date: 2018/5/12 16:11
 * @Description:
 * @Version: 1.0
 **/
@RestController
public class WeatherDataController {

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/cityId/{cityId}")
    public WeatherResponse getWeatherByCityId(@PathVariable("cityId") String cityId) {
        return weatherDataService.getDataByCityId(cityId);
    }

    @GetMapping(value = "/cityName")
    public WeatherResponse getWeatherByCityName(@PathParam("cityName") String cityName) {
        return weatherDataService.getDataByCityName(cityName);
    }
}
