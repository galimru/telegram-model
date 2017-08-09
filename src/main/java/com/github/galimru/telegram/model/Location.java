package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Location implements Serializable {
    private static final long serialVersionUID = 5505762429468760213L;

    private static final String LONGITUDE_FIELD = "longitude";
    private static final String LATITUDE_FIELD = "latitude";

    @JsonProperty(value = LONGITUDE_FIELD)
    private Float longitude;
    @JsonProperty(value = LATITUDE_FIELD)
    private Float latitude;

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
