package com.olamas.microservices.geolocation;

import com.olamas.microservices.model.GeoLocation;

import java.util.List;

public interface GeoLocationService {

    public GeoLocation create(GeoLocation geoLocation);

    public List<GeoLocation> findAll();
}
