package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

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

    public void setSmallFileId(String smallFileId) {
        this.smallFileId = smallFileId;
    }

    public String getBigFileId() {
        return bigFileId;
    }

    public void setBigFileId(String bigFileId) {
        this.bigFileId = bigFileId;
    }

    @Override
    public String toString() {
        return "ChatPhoto{" +
                "smallFileId='" + smallFileId + '\'' +
                ", bigFileId='" + bigFileId + '\'' +
                '}';
    }
}
