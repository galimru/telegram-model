package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Venue implements Serializable {
    private static final long serialVersionUID = -3091755494927881669L;

    private static final String LOCATION_FIELD = "location";
    private static final String TITLE_FIELD = "title";
    private static final String ADDRESS_FIELD = "address";
    private static final String FOURSQUARE_ID_FIELD = "foursquare_id";

    @JsonProperty(value = LOCATION_FIELD)
    private Location location;
    @JsonProperty(value = TITLE_FIELD)
    private String title;
    @JsonProperty(value = ADDRESS_FIELD)
    private String address;
    @JsonProperty(value = FOURSQUARE_ID_FIELD)
    private String foursquareId;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFoursquareId() {
        return foursquareId;
    }

    public void setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "location=" + location +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", foursquareId='" + foursquareId + '\'' +
                '}';
    }
}
