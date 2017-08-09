package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class Game implements Serializable {
    private static final long serialVersionUID = -2511198543264716478L;

    private static final String TITLE_FIELD = "title";
    private static final String DESCRIPTION_FIELD = "description";
    private static final String PHOTO_FIELD = "photo";
    private static final String TEXT_FIELD = "text";
    private static final String TEXT_ENTITIES_FIELD = "text_entities";
    private static final String ANIMATION_FIELD = "animation";

    @JsonProperty(value = TITLE_FIELD)
    private String title;
    @JsonProperty(value = DESCRIPTION_FIELD)
    private String description;
    @JsonProperty(value = PHOTO_FIELD)
    private List<PhotoSize> photo;
    @JsonProperty(value = TEXT_FIELD)
    private String text;
    @JsonProperty(value = TEXT_ENTITIES_FIELD)
    private List<MessageEntity> textEntities;
    @JsonProperty(value = ANIMATION_FIELD)
    private Animation animation;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    public void setTextEntities(List<MessageEntity> textEntities) {
        this.textEntities = textEntities;
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", photo=" + photo +
                ", text='" + text + '\'' +
                ", textEntities=" + textEntities +
                ", animation=" + animation +
                '}';
    }
}
