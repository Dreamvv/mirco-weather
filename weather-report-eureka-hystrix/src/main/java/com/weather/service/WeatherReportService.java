package com.weather.service;

import com.weather.entity.Weather;

public interface WeatherReportService {

    /**
     * 根据城市ID查找天气
     * @param cityId
     * @return
     */
    Weather getDataByCityId(String cityId);
}
