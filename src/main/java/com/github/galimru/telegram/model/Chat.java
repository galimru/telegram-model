package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ChatType getType() {
        return type;
    }

    public void setType(ChatType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getAllMembersAreAdministrators() {
        return allMembersAreAdministrators;
    }

    public void setAllMembersAreAdministrators(Boolean allMembersAreAdministrators) {
        this.allMembersAreAdministrators = allMembersAreAdministrators;
    }

    public ChatPhoto getPhoto() {
        return photo;
    }

    public void setPhoto(ChatPhoto photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInviteLink() {
        return inviteLink;
    }

    public void setInviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
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
                '}';
    }
}
