package com.weather.service;

public interface WeatherDataCollectionnServcie {
    /**
     * 根据城市ID同步天气
     * @param cityId
     */
    void syncDataByCityId(String cityId);
}
