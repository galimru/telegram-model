package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Chat implements Serializable {
    private static final long serialVersionUID = 8456490272567236258L;

    private static final String ID_FIELD = "id";
    private static final String TYPE_FIELD = "type";
    private static final String TITLE_FIELD = "title";
    private static final String USERNAME_FIELD = "username";
    private static final String FIRST_NAME_FIELD = "first_name";
    private static final String LAST_NAME_FIELD = "last_name";
    private static final String ALL_MEMBERS_ARE_ADMINISTRATORS_FIELD = "all_members_are_administrators";
    private static final String PHOTO_FIELD = "photo";
    private static final String DESCRIPTION_FIELD = "description";
    private static final String INVITE_LINK_FIELD = "invite_link";
    private static final String PINNED_MESSAGE_FIELD = "pinned_message";

    @JsonProperty(value = ID_FIELD)
    private Integer id;
    @JsonProperty(value = TYPE_FIELD)
    private ChatType type;
    @JsonProperty(value = TITLE_FIELD)
    private String title;
    @JsonProperty(value = USERNAME_FIELD)
    private String username;
    @JsonProperty(value = FIRST_NAME_FIELD)
    private String firstName;
    @JsonProperty(value = LAST_NAME_FIELD)
    private String lastName;
    @JsonProperty(value = ALL_MEMBERS_ARE_ADMINISTRATORS_FIELD)
    private Boolean allMembersAreAdministrators;
    @JsonProperty(value = PHOTO_FIELD)
    private ChatPhoto photo;
    @JsonProperty(value = DESCRIPTION_FIELD)
    private String description;
    @JsonProperty(value = INVITE_LINK_FIELD)
    private String inviteLink;
    @JsonProperty(value = PINNED_MESSAGE_FIELD)
    private Message pinnedMessage;

    public Integer getId() {
        return id;
    }

    public Chat setId(Integer id) {
        this.id = id;
        return this;
    }

    public ChatType getType() {
        return type;
    }

    public Chat setType(ChatType type) {
        this.type = type;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Chat setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Chat setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Chat setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Chat setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Boolean getAllMembersAreAdministrators() {
        return allMembersAreAdministrators;
    }

    public Chat setAllMembersAreAdministrators(Boolean allMembersAreAdministrators) {
        this.allMembersAreAdministrators = allMembersAreAdministrators;
        return this;
    }

    public ChatPhoto getPhoto() {
        return photo;
    }

    public Chat setPhoto(ChatPhoto photo) {
        this.photo = photo;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Chat setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getInviteLink() {
        return inviteLink;
    }

    public Chat setInviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
        return this;
    }

    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public Chat setPinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
        return this;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", allMembersAreAdministrators=" + allMembersAreAdministrators +
                ", photo=" + photo +
                ", description='" + description + '\'' +
                ", inviteLink='" + inviteLink + '\'' +
                ", pinnedMessage=" + pinnedMessage +
                '}';
    }
}
