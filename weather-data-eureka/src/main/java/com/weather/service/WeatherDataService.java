package com.weather.service;

import com.weather.entity.WeatherResponse;
import org.springframework.stereotype.Service;


public interface WeatherDataService {
    /**
     * 根据城市ID查询天气数据
     * @param cityId
     * @return
     */
    WeatherResponse getDataByCityId(String cityId);

    /**
     * 根据城市名字查询天气数据
     * @param cityName
     * @return
     */
    WeatherResponse getDataByCityName(String cityName);

}
