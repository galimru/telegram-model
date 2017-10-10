package com.github.galimru.telegram.methods;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.galimru.telegram.objects.ParseMode;
import com.github.galimru.telegram.objects.ReplyMarkup;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendMessage extends AbstractMethod {
    private static final long serialVersionUID = -598237276140872575L;

    private static final String CHAT_ID_FIELD = "chat_id";
    private static final String TEXT_FIELD = "text";
    private static final String PARSE_MODE_FIELD = "parse_mode";
    private static final String DISABLE_WEB_PAGE_PREVIEW_FIELD = "disable_web_page_preview";
    private static final String DISABLE_NOTIFICATION_FIELD = "disable_notification";
    private static final String REPLY_TO_MESSAGE_ID_FIELD = "reply_to_message_id";
    private static final String REPLY_MARKUP_FIELD = "reply_markup";

    @JsonProperty(value = CHAT_ID_FIELD)
    private String chatId;
    @JsonProperty(value = TEXT_FIELD)
    private String text;
    @JsonProperty(value = PARSE_MODE_FIELD)
    private ParseMode parseMode;
    @JsonProperty(value = DISABLE_WEB_PAGE_PREVIEW_FIELD)
    private Boolean disableWebPagePreview;
    @JsonProperty(value = DISABLE_NOTIFICATION_FIELD)
    private Boolean disableNotification;
    @JsonProperty(value = REPLY_TO_MESSAGE_ID_FIELD)
    private Integer replyToMessageId;
    @JsonProperty(value = REPLY_MARKUP_FIELD)
    private ReplyMarkup replyMarkup;

    public String getChatId() {
        return chatId;
    }

    public SendMessage setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    public String getText() {
        return text;
    }

    public SendMessage setText(String text) {
        this.text = text;
        return this;
    }

    public ParseMode getParseMode() {
        return parseMode;
    }

    public SendMessage setParseMode(ParseMode parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    public Boolean getDisableWebPagePreview() {
        return disableWebPagePreview;
    }

    public SendMessage setDisableWebPagePreview(Boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
        return this;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public SendMessage setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    public Integer getReplyToMessageId() {
        return replyToMessageId;
    }

    public SendMessage setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    public ReplyMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public SendMessage setReplyMarkup(ReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String toString() {
        return "SendMessage{" +
                "chatId='" + chatId + '\'' +
                ", text='" + text + '\'' +
                ", parseMode=" + parseMode +
                ", disableWebPagePreview=" + disableWebPagePreview +
                ", disableNotification=" + disableNotification +
                ", replyToMessageId=" + replyToMessageId +
                ", replyMarkup=" + replyMarkup +
                '}';
    }
}
