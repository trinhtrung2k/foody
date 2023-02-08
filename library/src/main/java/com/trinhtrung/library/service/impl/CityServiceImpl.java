package com.trinhtrung.library.service.impl;

import com.trinhtrung.library.model.City;
import com.trinhtrung.library.repository.CityRepository;
import com.trinhtrung.library.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }
}

