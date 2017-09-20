package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InlineQuery implements Serializable {
    private static final long serialVersionUID = -5576345499845554035L;

    private static final String ID_FIELD = "id";
    private static final String FROM_FIELD = "from";
    private static final String LOCATION_FIELD = "location";
    private static final String QUERY_FIELD = "query";
    private static final String OFFSET_FIELD = "offset";

    @JsonProperty(value = ID_FIELD)
    private String id;
    @JsonProperty(value = FROM_FIELD)
    private User from;
    @JsonProperty(value = LOCATION_FIELD)
    private Location location;
    @JsonProperty(value = QUERY_FIELD)
    private String query;
    @JsonProperty(value = OFFSET_FIELD)
    private String offset;

    public String getId() {
        return id;
    }

    public InlineQuery setId(String id) {
        this.id = id;
        return this;
    }

    public User getFrom() {
        return from;
    }

    public InlineQuery setFrom(User from) {
        this.from = from;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public InlineQuery setLocation(Location location) {
        this.location = location;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public InlineQuery setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getOffset() {
        return offset;
    }

    public InlineQuery setOffset(String offset) {
        this.offset = offset;
        return this;
    }

    @Override
    public String toString() {
        return "InlineQuery{" +
                "id='" + id + '\'' +
                ", from=" + from +
                ", location=" + location +
                ", query='" + query + '\'' +
                ", offset='" + offset + '\'' +
                '}';
    }
}
