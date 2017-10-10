package com.github.galimru.telegram.methods;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.galimru.telegram.objects.InlineKeyboardMarkup;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditMessageReplyMarkup extends AbstractMethod {
    private static final long serialVersionUID = -2140568579540618948L;

    private static final String CHAT_ID_FIELD = "chat_id";
    private static final String MESSAGE_ID_FIELD = "message_id";
    private static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
    private static final String REPLY_MARKUP_FIELD = "reply_markup";

    @JsonProperty(value = CHAT_ID_FIELD)
    private String chatId;
    @JsonProperty(value = MESSAGE_ID_FIELD)
    private Integer messageId;
    @JsonProperty(value = INLINE_MESSAGE_ID_FIELD)
    private String inlineMessageId;
    @JsonProperty(value = REPLY_MARKUP_FIELD)
    private InlineKeyboardMarkup replyMarkup;

    public String getChatId() {
        return chatId;
    }

    public EditMessageReplyMarkup setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public EditMessageReplyMarkup setMessageId(Integer messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public EditMessageReplyMarkup setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public EditMessageReplyMarkup setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }
}
