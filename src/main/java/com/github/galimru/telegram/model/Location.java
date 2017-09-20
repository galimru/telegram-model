package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public Location setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    public Float getLatitude() {
        return latitude;
    }

    public Location setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    @Override
    public String toString() {
        return "Location{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
