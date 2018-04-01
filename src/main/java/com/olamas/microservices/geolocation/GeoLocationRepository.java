package com.olamas.microservices.geolocation;


import com.olamas.microservices.model.GeoLocation;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class GeoLocationRepository {

    private List<GeoLocation> geolocations = new ArrayList<GeoLocation>();

    public void addGeoLocation(GeoLocation geolocation) {
        geolocations.add(geolocation);
    }
    public List<GeoLocation> getGeoLocations() {
        return Collections.unmodifiableList(geolocations);
    }
}
