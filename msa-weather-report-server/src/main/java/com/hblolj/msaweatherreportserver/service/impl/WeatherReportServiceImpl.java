package com.hblolj.msaweatherreportserver.service.impl;

import com.hblolj.msaweatherreportserver.service.WeatherDataService;
import com.hblolj.msaweatherreportserver.service.WeatherReportService;
import com.hblolj.msaweatherreportserver.vo.Weather;
import com.hblolj.msaweatherreportserver.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author: hblolj
 * @Date: 2018/5/12 16:22
 * @Description:
 * @Version: 1.0
 **/
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Autowired
    private WeatherDataService weatherDataService;

    @Override
    public Weather getDataByCityId(String cityId) {
        // 由天气数据 API 微服务来提供
        WeatherResponse response = weatherDataService.getWeatherByCityId(cityId);
        return response.getData();
    }
}
