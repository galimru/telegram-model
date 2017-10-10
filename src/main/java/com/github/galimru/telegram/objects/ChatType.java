package com.github.galimru.telegram.objects;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ChatType {
    PRIVATE("private"),
    GROUP("group"),
    SUPERGROUP("supergroup"),
    CHANNEL("channel");

    private String value;

    ChatType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
