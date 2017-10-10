package com.github.galimru.telegram.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Invoice implements Serializable {
    private static final long serialVersionUID = 1048297226985741657L;

    private static final String TITLE_FIELD = "title";
    private static final String DESCRIPTION_FIELD = "description";
    private static final String START_PARAMETER_FIELD = "start_parameter";
    private static final String CURRENCY_FIELD = "currency";
    private static final String TOTAL_AMOUNT_FIELD = "total_amount";

    @JsonProperty(value = TITLE_FIELD)
    private String title;
    @JsonProperty(value = DESCRIPTION_FIELD)
    private String description;
    @JsonProperty(value = START_PARAMETER_FIELD)
    private String startParameter;
    @JsonProperty(value = CURRENCY_FIELD)
    private String currency;
    @JsonProperty(value = TOTAL_AMOUNT_FIELD)
    private Integer totalAmount;

    public String getTitle() {
        return title;
    }

    public Invoice setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Invoice setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getStartParameter() {
        return startParameter;
    }

    public Invoice setStartParameter(String startParameter) {
        this.startParameter = startParameter;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public Invoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public Invoice setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startParameter='" + startParameter + '\'' +
                ", currency='" + currency + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
