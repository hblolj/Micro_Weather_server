package com.hblolj.msaweatherreportserver.service;

import com.hblolj.msaweatherreportserver.vo.Weather;

/**
 * @author: hblolj
 * @Date: 2018/5/12 16:21
 * @Description:
 * @Version: 1.0
 **/
public interface WeatherReportService {

    Weather getDataByCityId(String cityId);
}
