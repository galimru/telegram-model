package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Arrays;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplyKeyboardMarkup implements ReplyMarkup, Serializable {
    private static final long serialVersionUID = -7297718303010451935L;

    private static final String KEYBOARD_FIELD = "keyboard";
    private static final String RESIZE_KEYBOARD_FIELD = "resize_keyboard";
    private static final String ONE_TIME_KEYBOARD_FIELD = "one_time_keyboard";
    private static final String SELECTIVE_FIELD = "selective";

    @JsonProperty(value = KEYBOARD_FIELD)
    private KeyboardButton[][] keyboard;
    @JsonProperty(value = RESIZE_KEYBOARD_FIELD)
    private Boolean resizeKeyboard;
    @JsonProperty(value = ONE_TIME_KEYBOARD_FIELD)
    private Boolean oneTimeKeyboard;
    @JsonProperty(value = SELECTIVE_FIELD)
    private Boolean selective;

    public KeyboardButton[][] getKeyboard() {
        return keyboard;
    }

    public ReplyKeyboardMarkup setKeyboard(KeyboardButton[][] keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    public Boolean getResizeKeyboard() {
        return resizeKeyboard;
    }

    public ReplyKeyboardMarkup setResizeKeyboard(Boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
        return this;
    }

    public Boolean getOneTimeKeyboard() {
        return oneTimeKeyboard;
    }

    public ReplyKeyboardMarkup setOneTimeKeyboard(Boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
        return this;
    }

    public Boolean getSelective() {
        return selective;
    }

    public ReplyKeyboardMarkup setSelective(Boolean selective) {
        this.selective = selective;
        return this;
    }

    @Override
    public String toString() {
        return "ReplyKeyboardMarkup{" +
                "keyboard=" + Arrays.toString(keyboard) +
                ", resizeKeyboard=" + resizeKeyboard +
                ", oneTimeKeyboard=" + oneTimeKeyboard +
                ", selective=" + selective +
                '}';
    }
}
