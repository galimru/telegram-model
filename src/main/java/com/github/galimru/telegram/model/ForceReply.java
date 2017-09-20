package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForceReply implements ReplyMarkup, Serializable {
    private static final long serialVersionUID = 5020439212308703435L;

    private static final String FORCE_REPLY_FIELD = "force_reply";
    private static final String SELECTIVE_FIELD = "selective";

    @JsonProperty(value = FORCE_REPLY_FIELD)
    private Boolean forceReply;
    @JsonProperty(value = SELECTIVE_FIELD)
    private Boolean selective;

    public Boolean getForceReply() {
        return forceReply;
    }

    public ForceReply setForceReply(Boolean forceReply) {
        this.forceReply = forceReply;
        return this;
    }

    public Boolean getSelective() {
        return selective;
    }

    public ForceReply setSelective(Boolean selective) {
        this.selective = selective;
        return this;
    }

    @Override
    public String toString() {
        return "ForceReply{" +
                "forceReply=" + forceReply +
                ", selective=" + selective +
                '}';
    }
}
