package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ChosenInlineResult implements Serializable {
    private static final long serialVersionUID = 3713337570519554578L;

    private static final String RESULT_ID_FIELD = "result_id";
    private static final String FROM_FIELD = "from";
    private static final String LOCATION_FIELD = "location";
    private static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
    private static final String QUERY_FIELD = "query";

    @JsonProperty(value = RESULT_ID_FIELD)
    private String resultId;
    @JsonProperty(value = FROM_FIELD)
    private User from;
    @JsonProperty(value = LOCATION_FIELD)
    private Location location;
    @JsonProperty(value = INLINE_MESSAGE_ID_FIELD)
    private String inlineMessageId;
    @JsonProperty(value = QUERY_FIELD)
    private String query;

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "ChosenInlineResult{" +
                "resultId='" + resultId + '\'' +
                ", from=" + from +
                ", location=" + location +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                ", query='" + query + '\'' +
                '}';
    }
}
