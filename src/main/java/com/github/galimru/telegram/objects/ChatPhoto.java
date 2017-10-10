package com.github.galimru.telegram.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatPhoto implements Serializable {
    private static final long serialVersionUID = 1521698188691806842L;

    private static final String SMALL_FILE_ID_FIELD = "small_file_id";
    private static final String BIG_FILE_ID_FIELD = "big_file_id";

    @JsonProperty(value = SMALL_FILE_ID_FIELD)
    private String smallFileId;
    @JsonProperty(value = BIG_FILE_ID_FIELD)
    private String bigFileId;

    public String getSmallFileId() {
        return smallFileId;
    }

    public ChatPhoto setSmallFileId(String smallFileId) {
        this.smallFileId = smallFileId;
        return this;
    }

    public String getBigFileId() {
        return bigFileId;
    }

    public ChatPhoto setBigFileId(String bigFileId) {
        this.bigFileId = bigFileId;
        return this;
    }

    @Override
    public String toString() {
        return "ChatPhoto{" +
                "smallFileId='" + smallFileId + '\'' +
                ", bigFileId='" + bigFileId + '\'' +
                '}';
    }
}
