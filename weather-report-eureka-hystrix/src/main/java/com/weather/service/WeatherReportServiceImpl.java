package com.weather.service;

import com.weather.entity.Weather;
import com.weather.entity.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherReportServiceImpl implements WeatherReportService {
    @Autowired
    private DataClient dataClient;
    @Override
    public Weather getDataByCityId(String cityId) {
        //天气数据API微服务来提供
        WeatherResponse resp = dataClient.getDataByCityId(cityId);
        Weather data = null;
        if (resp != null){
            data = resp.getData();
        }

        return data;
    }
}
