package com.hblolj.msaweathercityserver.service;

import com.hblolj.msaweathercityserver.vo.City;

import java.util.List;

/**
 * @author: hblolj
 * @Date: 2018/5/12 17:20
 * @Description:
 * @Version: 1.0
 **/
public interface CityDataService {

    /**
     * 获取 City 列表
     * @return
     * @throws Exception
     */
    List<City> listCity() throws Exception;
}
