package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Arrays;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InlineKeyboardMarkup implements ReplyMarkup, Serializable {
    private static final long serialVersionUID = 3446228820241541299L;

    private static final String INLINE_KEYBOARD_FIELD = "inline_keyboard";

    @JsonProperty(value = INLINE_KEYBOARD_FIELD)
    private InlineKeyboardButton[][] inlineKeyboard;

    public InlineKeyboardButton[][] getInlineKeyboard() {
        return inlineKeyboard;
    }

    public void setInlineKeyboard(InlineKeyboardButton[][] inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }

    @Override
    public String toString() {
        return "InlineKeyboardMarkup{" +
                "inlineKeyboard=" + Arrays.toString(inlineKeyboard) +
                '}';
    }
}
