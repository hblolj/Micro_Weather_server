package com.hblolj.msaweatherdataserver.service;

import com.hblolj.msaweatherdataserver.vo.WeatherResponse;

/**
 * @author: hblolj
 * @Date: 2018/5/12 15:59
 * @Description:
 * @Version: 1.0
 **/
public interface WeatherDataService {

    /**
     * 按城市 Id 获取天气信息
     * @param cityId
     * @return
     */
    WeatherResponse getDataByCityId(String cityId);

    /**
     * 按城市 Name 获取天气信息
     * @param cityName
     * @return
     */
    WeatherResponse getDataByCityName(String cityName);
}
