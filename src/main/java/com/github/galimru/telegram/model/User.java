package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable {
    private static final long serialVersionUID = 2298254206791964438L;

    private static final String ID_FIELD = "id";
    private static final String IS_BOT_FIELD = "is_bot";
    private static final String FIRST_NAME_FIELD = "first_name";
    private static final String LAST_NAME_FIELD = "last_name";
    private static final String USERNAME_FIELD = "username";
    private static final String LANGUAGE_CODE_FIELD = "language_code";

    @JsonProperty(value = ID_FIELD)
    private Integer id;
    @JsonProperty(value = IS_BOT_FIELD)
    private Boolean isBot;
    @JsonProperty(value = FIRST_NAME_FIELD)
    private String firstName;
    @JsonProperty(value = LAST_NAME_FIELD)
    private String lastName;
    @JsonProperty(value = USERNAME_FIELD)
    private String username;
    @JsonProperty(value = LANGUAGE_CODE_FIELD)
    private String languageCode;

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getBot() {
        return isBot;
    }

    public User setBot(Boolean bot) {
        isBot = bot;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public User setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", isBot=" + isBot +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", languageCode='" + languageCode + '\'' +
                '}';
    }
}
