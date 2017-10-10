package com.github.galimru.telegram.objects;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ParseMode {
    MARKDOWN("markdown"),
    HTML("html");

    private String value;

    ParseMode(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
