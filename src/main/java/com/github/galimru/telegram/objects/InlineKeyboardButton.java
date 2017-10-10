package com.github.galimru.telegram.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InlineKeyboardButton implements Serializable {
    private static final long serialVersionUID = 7668392554306304671L;

    private static final String TEXT_FIELD = "text";
    private static final String URL_FIELD = "url";
    private static final String CALLBACK_DATA_FIELD = "callback_data";
    private static final String SWITCH_INLINE_QUERY_FIELD = "switch_inline_query";
    private static final String SWITCH_INLINE_QUERY_CURRENT_CHAT_FIELD = "switch_inline_query_current_chat";
    private static final String CALLBACK_GAME_FIELD = "callback_game";
    private static final String PAY_FIELD = "pay";

    @JsonProperty(value = TEXT_FIELD)
    private String text;
    @JsonProperty(value = URL_FIELD)
    private String url;
    @JsonProperty(value = CALLBACK_DATA_FIELD)
    private String callbackData;
    @JsonProperty(value = SWITCH_INLINE_QUERY_FIELD)
    private String switchInlineQuery;
    @JsonProperty(value = SWITCH_INLINE_QUERY_CURRENT_CHAT_FIELD)
    private String switchInlineQueryCurrentChat;
    @JsonProperty(value = CALLBACK_GAME_FIELD)
    private String callbackGame;
    @JsonProperty(value = PAY_FIELD)
    private Boolean pay;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public String getSwitchInlineQuery() {
        return switchInlineQuery;
    }

    public void setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
    }

    public String getSwitchInlineQueryCurrentChat() {
        return switchInlineQueryCurrentChat;
    }

    public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
    }

    public String getCallbackGame() {
        return callbackGame;
    }

    public void setCallbackGame(String callbackGame) {
        this.callbackGame = callbackGame;
    }

    public Boolean getPay() {
        return pay;
    }

    public void setPay(Boolean pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "InlineKeyboardButton{" +
                "text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", callbackData='" + callbackData + '\'' +
                ", switchInlineQuery='" + switchInlineQuery + '\'' +
                ", switchInlineQueryCurrentChat='" + switchInlineQueryCurrentChat + '\'' +
                ", callbackGame='" + callbackGame + '\'' +
                ", pay=" + pay +
                '}';
    }
}
