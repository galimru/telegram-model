package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.CLASS,
        include = JsonTypeInfo.As.PROPERTY,
        defaultImpl = ReplyKeyboardMarkup.class
)
public interface ReplyMarkup {
}
