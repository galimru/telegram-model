package com.github.galimru.telegram.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Update implements Serializable {
    private static final long serialVersionUID = -7340254223528428111L;

    private static final String UPDATE_ID_FIELD = "update_id";
    private static final String MESSAGE_FIELD = "message";
    private static final String EDITED_MESSAGE_FIELD = "edited_message";
    private static final String CHANNEL_POST_FIELD = "channel_post";
    private static final String EDITED_CHANNEL_POST_FIELD = "edited_channel_post";
    private static final String INLINE_QUERY_FIELD = "inline_query";
    private static final String CHOSEN_INLINE_RESULT_FIELD = "chosen_inline_result";
    private static final String CALLBACK_QUERY_FIELD = "callback_query";
    private static final String SHIPPING_QUERY_FIELD = "shipping_query";
    private static final String PRE_CHECKOUT_QUERY_FIELD = "pre_checkout_query";

    @JsonProperty(value = UPDATE_ID_FIELD)
    private Integer updateId;
    @JsonProperty(value = MESSAGE_FIELD)
    private Message message;
    @JsonProperty(value = EDITED_MESSAGE_FIELD)
    private Message editedMessage;
    @JsonProperty(value = CHANNEL_POST_FIELD)
    private Message channelPost;
    @JsonProperty(value = EDITED_CHANNEL_POST_FIELD)
    private Message editedChannelPost;
    @JsonProperty(value = INLINE_QUERY_FIELD)
    private InlineQuery inlineQuery;
    @JsonProperty(value = CHOSEN_INLINE_RESULT_FIELD)
    private ChosenInlineResult chosenInlineResult;
    @JsonProperty(value = CALLBACK_QUERY_FIELD)
    private CallbackQuery callbackQuery;
    @JsonProperty(value = SHIPPING_QUERY_FIELD)
    private String shippingQuery;
    @JsonProperty(value = PRE_CHECKOUT_QUERY_FIELD)
    private String preCheckoutQuery;

    public Integer getUpdateId() {
        return updateId;
    }

    public Update setUpdateId(Integer updateId) {
        this.updateId = updateId;
        return this;
    }

    public Message getMessage() {
        return message;
    }

    public Update setMessage(Message message) {
        this.message = message;
        return this;
    }

    public Message getEditedMessage() {
        return editedMessage;
    }

    public Update setEditedMessage(Message editedMessage) {
        this.editedMessage = editedMessage;
        return this;
    }

    public Message getChannelPost() {
        return channelPost;
    }

    public Update setChannelPost(Message channelPost) {
        this.channelPost = channelPost;
        return this;
    }

    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    public Update setEditedChannelPost(Message editedChannelPost) {
        this.editedChannelPost = editedChannelPost;
        return this;
    }

    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public Update setInlineQuery(InlineQuery inlineQuery) {
        this.inlineQuery = inlineQuery;
        return this;
    }

    public ChosenInlineResult getChosenInlineResult() {
        return chosenInlineResult;
    }

    public Update setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
        this.chosenInlineResult = chosenInlineResult;
        return this;
    }

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    public Update setCallbackQuery(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        return this;
    }

    public String getShippingQuery() {
        return shippingQuery;
    }

    public Update setShippingQuery(String shippingQuery) {
        this.shippingQuery = shippingQuery;
        return this;
    }

    public String getPreCheckoutQuery() {
        return preCheckoutQuery;
    }

    public Update setPreCheckoutQuery(String preCheckoutQuery) {
        this.preCheckoutQuery = preCheckoutQuery;
        return this;
    }

    @Override
    public String toString() {
        return "Update{" +
                "updateId=" + updateId +
                ", message=" + message +
                ", editedMessage=" + editedMessage +
                ", channelPost=" + channelPost +
                ", editedChannelPost=" + editedChannelPost +
                ", inlineQuery=" + inlineQuery +
                ", chosenInlineResult=" + chosenInlineResult +
                ", callbackQuery=" + callbackQuery +
                ", shippingQuery='" + shippingQuery + '\'' +
                ", preCheckoutQuery='" + preCheckoutQuery + '\'' +
                '}';
    }
}
