package com.hblolj.msaweathercollectionserver.controller;

import com.hblolj.msaweathercollectionserver.service.WeatherCityService;
import com.hblolj.msaweathercollectionserver.service.WeatherDataCollectionService;
import com.hblolj.msaweathercollectionserver.vo.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: hblolj
 * @Date: 2018/5/13 17:23
 * @Description:
 * @Version: 1.0
 **/
@RestController
public class HandModelController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private WeatherCityService weatherCityService;

    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;

    @GetMapping("/sysncData")
    public Boolean sysncData(){
        logger.info("Weather Data Sync Job. Start！");
        // 获取城市ID列表
        // 改为由城市数据微服务提供数据
        List<City> cityList = weatherCityService.listCity();

        // 遍历城市ID获取天气
        for (City city : cityList) {
            String cityId = city.getCityId();
            logger.info("Weather Data Sync Job, cityId:" + cityId);

            weatherDataCollectionService.sysncDataByCityId(cityId);
        }

        logger.info("Weather Data Sync Job. End！");

        return true;
    }
}
