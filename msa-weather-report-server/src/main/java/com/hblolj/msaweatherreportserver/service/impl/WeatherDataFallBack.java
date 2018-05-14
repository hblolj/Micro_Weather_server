package com.hblolj.msaweatherreportserver.service.impl;

import com.hblolj.msaweatherreportserver.service.WeatherDataService;
import com.hblolj.msaweatherreportserver.vo.City;
import com.hblolj.msaweatherreportserver.vo.WeatherResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hblolj
 * @Date: 2018/5/14 17:21
 * @Description:
 * @Version: 1.0
 **/
@Component
public class WeatherDataFallBack implements WeatherDataService{

    @Override
    public List<City> listCity() {
        List<City> cityList = null;
        cityList = new ArrayList<>();

        City city = new City();
        city.setCityId("101280601");
        city.setCityName("深圳");
        cityList.add(city);

        city = new City();
        city.setCityId("101280301");
        city.setCityName("惠州");
        cityList.add(city);
        return cityList;
    }

    @Override
    public WeatherResponse getWeatherByCityId(String cityId) {
        return null;
    }
}
