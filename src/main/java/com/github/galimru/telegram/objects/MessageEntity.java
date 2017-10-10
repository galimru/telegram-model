package com.github.galimru.telegram.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public MessageEntity setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getOffset() {
        return offset;
    }

    public MessageEntity setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public MessageEntity setLength(Integer length) {
        this.length = length;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MessageEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    public User getUser() {
        return user;
    }

    public MessageEntity setUser(User user) {
        this.user = user;
        return this;
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
