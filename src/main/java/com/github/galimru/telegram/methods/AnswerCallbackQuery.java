package com.github.galimru.telegram.methods;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnswerCallbackQuery extends AbstractMethod {
    private static final long serialVersionUID = 9132361565291696257L;

    private static final String CALLBACK_QUERY_ID_FIELD = "callback_query_id";
    private static final String TEXT_FIELD = "text";
    private static final String SHOW_ALERT_FIELD = "show_alert";
    private static final String URL_FIELD = "url";
    private static final String CACHE_TIME_FIELD = "cache_time";

    @JsonProperty(value = CALLBACK_QUERY_ID_FIELD)
    private String callbackQueryId;
    @JsonProperty(value = TEXT_FIELD)
    private String text;
    @JsonProperty(value = SHOW_ALERT_FIELD)
    private Boolean showAlert;
    @JsonProperty(value = URL_FIELD)
    private String url;
    @JsonProperty(value = CACHE_TIME_FIELD)
    private Integer cacheTime;

    public String getCallbackQueryId() {
        return callbackQueryId;
    }

    public AnswerCallbackQuery setCallbackQueryId(String callbackQueryId) {
        this.callbackQueryId = callbackQueryId;
        return this;
    }

    public String getText() {
        return text;
    }

    public AnswerCallbackQuery setText(String text) {
        this.text = text;
        return this;
    }

    public Boolean getShowAlert() {
        return showAlert;
    }

    public AnswerCallbackQuery setShowAlert(Boolean showAlert) {
        this.showAlert = showAlert;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AnswerCallbackQuery setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getCacheTime() {
        return cacheTime;
    }

    public AnswerCallbackQuery setCacheTime(Integer cacheTime) {
        this.cacheTime = cacheTime;
        return this;
    }
}
