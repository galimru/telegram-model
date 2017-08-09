package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class MessageEntity implements Serializable {
    private static final long serialVersionUID = 6069400856606042934L;

    private static final String TYPE_FIELD = "type";
    private static final String OFFSET_FIELD = "offset";
    private static final String LENGTH_FIELD = "length";
    private static final String URL_FIELD = "url";
    private static final String USER_FIELD = "user";

    @JsonProperty(value = TYPE_FIELD)
    private String type;
    @JsonProperty(value = OFFSET_FIELD)
    private Integer offset;
    @JsonProperty(value = LENGTH_FIELD)
    private Integer length;
    @JsonProperty(value = URL_FIELD)
    private String url;
    @JsonProperty(value = USER_FIELD)
    private User user;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "type='" + type + '\'' +
                ", offset=" + offset +
                ", length=" + length +
                ", url='" + url + '\'' +
                ", user=" + user +
                '}';
    }
}
