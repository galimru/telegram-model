package com.github.galimru.telegram.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyboardButton implements Serializable {
    private static final long serialVersionUID = 2276732705584118903L;
    
    private static final String TEXT_FIELD = "text";
    private static final String REQUEST_CONTACT_FIELD = "request_contact";
    private static final String REQUEST_LOCATION_FIELD = "request_location";
    
    @JsonProperty(value = TEXT_FIELD)
    private String text;
    @JsonProperty(value = REQUEST_CONTACT_FIELD)
    private Boolean requestContact;
    @JsonProperty(value = REQUEST_LOCATION_FIELD)
    private Boolean requestLocation;

    public String getText() {
        return text;
    }

    public KeyboardButton setText(String text) {
        this.text = text;
        return this;
    }

    public Boolean getRequestContact() {
        return requestContact;
    }

    public KeyboardButton setRequestContact(Boolean requestContact) {
        this.requestContact = requestContact;
        return this;
    }

    public Boolean getRequestLocation() {
        return requestLocation;
    }

    public KeyboardButton setRequestLocation(Boolean requestLocation) {
        this.requestLocation = requestLocation;
        return this;
    }

    @Override
    public String toString() {
        return "KeyboardButton{" +
                "text='" + text + '\'' +
                ", requestContact=" + requestContact +
                ", requestLocation=" + requestLocation +
                '}';
    }
}

