package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public ChosenInlineResult setResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    public User getFrom() {
        return from;
    }

    public ChosenInlineResult setFrom(User from) {
        this.from = from;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public ChosenInlineResult setLocation(Location location) {
        this.location = location;
        return this;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public ChosenInlineResult setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public ChosenInlineResult setQuery(String query) {
        this.query = query;
        return this;
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
