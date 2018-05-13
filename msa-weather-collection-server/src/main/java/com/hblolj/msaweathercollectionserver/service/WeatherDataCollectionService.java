package com.hblolj.msaweathercollectionserver.service;

/**
 * @author: hblolj
 * @Date: 2018/5/12 15:30
 * @Description:
 * @Version: 1.0
 **/
public interface WeatherDataCollectionService {

    /**
     * 根据城市Id同步天气
     * @param cityId
     */
    void sysncDataByCityId(String cityId);
}
