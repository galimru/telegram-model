package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CallbackQuery implements Serializable {
    private static final long serialVersionUID = 464484152798434695L;

    private static final String ID_FIELD = "id";
    private static final String FROM_FIELD = "from";
    private static final String MESSAGE_FIELD = "message";
    private static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
    private static final String CHAT_INSTANCE_FIELD = "chat_instance";
    private static final String DATA_FIELD = "data";
    private static final String GAME_SHORT_NAME_FIELD = "game_short_name";

    @JsonProperty(value = ID_FIELD)
    private String id;
    @JsonProperty(value = FROM_FIELD)
    private User from;
    @JsonProperty(value = MESSAGE_FIELD)
    private Message message;
    @JsonProperty(value = INLINE_MESSAGE_ID_FIELD)
    private String inlineMessageId;
    @JsonProperty(value = CHAT_INSTANCE_FIELD)
    private String chatInstance;
    @JsonProperty(value = DATA_FIELD)
    private String data;
    @JsonProperty(value = GAME_SHORT_NAME_FIELD)
    private String gameShortName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public String getChatInstance() {
        return chatInstance;
    }

    public void setChatInstance(String chatInstance) {
        this.chatInstance = chatInstance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public void setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
    }

    @Override
    public String toString() {
        return "CallbackQuery{" +
                "id='" + id + '\'' +
                ", from=" + from +
                ", message=" + message +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                ", chatInstance='" + chatInstance + '\'' +
                ", data='" + data + '\'' +
                ", gameShortName='" + gameShortName + '\'' +
                '}';
    }
}
