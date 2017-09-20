package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public CallbackQuery setId(String id) {
        this.id = id;
        return this;
    }

    public User getFrom() {
        return from;
    }

    public CallbackQuery setFrom(User from) {
        this.from = from;
        return this;
    }

    public Message getMessage() {
        return message;
    }

    public CallbackQuery setMessage(Message message) {
        this.message = message;
        return this;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public CallbackQuery setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    public String getChatInstance() {
        return chatInstance;
    }

    public CallbackQuery setChatInstance(String chatInstance) {
        this.chatInstance = chatInstance;
        return this;
    }

    public String getData() {
        return data;
    }

    public CallbackQuery setData(String data) {
        this.data = data;
        return this;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public CallbackQuery setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
        return this;
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
