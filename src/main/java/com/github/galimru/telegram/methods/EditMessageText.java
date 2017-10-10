package com.github.galimru.telegram.methods;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.galimru.telegram.objects.InlineKeyboardMarkup;
import com.github.galimru.telegram.objects.ParseMode;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditMessageText extends AbstractMethod {
    private static final long serialVersionUID = 7785988383947608739L;

    private static final String CHAT_ID_FIELD = "chat_id";
    private static final String MESSAGE_ID_FIELD = "message_id";
    private static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
    private static final String TEXT_FIELD = "text";
    private static final String PARSE_MODE_FIELD = "parse_mode";
    private static final String DISABLE_WEB_PAGE_PREVIEW_FIELD = "disable_web_page_preview";
    private static final String REPLY_MARKUP_FIELD = "reply_markup";

    @JsonProperty(value = CHAT_ID_FIELD)
    private String chatId;
    @JsonProperty(value = MESSAGE_ID_FIELD)
    private Integer messageId;
    @JsonProperty(value = INLINE_MESSAGE_ID_FIELD)
    private String inlineMessageId;
    @JsonProperty(value = TEXT_FIELD)
    private String text;
    @JsonProperty(value = PARSE_MODE_FIELD)
    private ParseMode parseMode;
    @JsonProperty(value = DISABLE_WEB_PAGE_PREVIEW_FIELD)
    private Boolean disableWebPagePreview;
    @JsonProperty(value = REPLY_MARKUP_FIELD)
    private InlineKeyboardMarkup replyMarkup;

    public String getChatId() {
        return chatId;
    }

    public EditMessageText setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public EditMessageText setMessageId(Integer messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public EditMessageText setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    public String getText() {
        return text;
    }

    public EditMessageText setText(String text) {
        this.text = text;
        return this;
    }

    public ParseMode getParseMode() {
        return parseMode;
    }

    public EditMessageText setParseMode(ParseMode parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    public Boolean getDisableWebPagePreview() {
        return disableWebPagePreview;
    }

    public EditMessageText setDisableWebPagePreview(Boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
        return this;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public EditMessageText setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String toString() {
        return "EditMessageText{" +
                "chatId='" + chatId + '\'' +
                ", messageId=" + messageId +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                ", text='" + text + '\'' +
                ", parseMode=" + parseMode +
                ", disableWebPagePreview=" + disableWebPagePreview +
                ", replyMarkup=" + replyMarkup +
                '}';
    }
}
