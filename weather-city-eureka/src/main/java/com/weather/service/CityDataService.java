package com.weather.service;

import com.weather.entity.City;

import java.util.List;

public interface CityDataService {

    List<City> listCity() throws Exception;
}
