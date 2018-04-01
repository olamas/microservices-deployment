package com.olamas.microservices.geolocation;

import com.olamas.microservices.model.GeoLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeoLocationServiceImpl implements GeoLocationService {

    @Autowired
    private GeoLocationRepository repository;


    @Override
    public GeoLocation create(GeoLocation geoLocation) {
        repository.addGeoLocation(geoLocation);
        return geoLocation;
    }

    @Override
    public List<GeoLocation> findAll() {
        return repository.getGeoLocations();
    }
}
