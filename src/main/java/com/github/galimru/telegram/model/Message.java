package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class Message implements Serializable {
    private static final long serialVersionUID = 4762676246866525581L;

    private static final String MESSAGE_ID_FIELD = "message_id";
    private static final String FROM_FIELD = "from";
    private static final String DATE_FIELD = "date";
    private static final String CHAT_FIELD = "chat";
    private static final String FORWARD_FROM_FIELD = "forward_from";
    private static final String FORWARD_FROM_CHAT_FIELD = "forward_from_chat";
    private static final String FORWARD_FROM_MESSAGE_ID_FIELD = "forward_from_message_id";
    private static final String FORWARD_DATE_FIELD = "forward_date";
    private static final String REPLY_TO_MESSAGE_FIELD = "reply_to_message";
    private static final String EDIT_DATE_FIELD = "edit_date";
    private static final String TEXT_FIELD = "text";
    private static final String ENTITIES_FIELD = "entities";
    private static final String AUDIO_FIELD = "audio";
    private static final String DOCUMENT_FIELD = "document";
    private static final String GAME_FIELD = "game";
    private static final String PHOTO_FIELD = "photo";
    private static final String STICKER_FIELD = "sticker";
    private static final String VIDEO_FIELD = "video";
    private static final String VOICE_FIELD = "voice";
    private static final String VIDEO_NOTE_FIELD = "video_note";
    private static final String NEW_CHAT_MEMBERS_FIELD = "new_chat_members";
    private static final String CAPTION_FIELD = "caption";
    private static final String CONTACT_FIELD = "contact";
    private static final String LOCATION_FIELD = "location";
    private static final String VENUE_FIELD = "venue";
    private static final String NEW_CHAT_MEMBER_FIELD = "new_chat_member";
    private static final String LEFT_CHAT_MEMBER_FIELD = "left_chat_member";
    private static final String NEW_CHAT_TITLE_FIELD = "new_chat_title";
    private static final String NEW_CHAT_PHOTO_FIELD = "new_chat_photo";
    private static final String DELETE_CHAT_PHOTO_FIELD = "delete_chat_photo";
    private static final String GROUP_CHAT_CREATED_FIELD = "group_chat_created";
    private static final String SUPERGROUP_CHAT_CREATED_FIELD = "supergroup_chat_created";
    private static final String CHANNEL_CHAT_CREATED_FIELD = "channel_chat_created";
    private static final String MIGRATE_TO_CHAT_ID_FIELD = "migrate_to_chat_id";
    private static final String MIGRATE_FROM_CHAT_ID_FIELD = "migrate_from_chat_id";
    private static final String PINNED_MESSAGE_FIELD = "pinned_message";
    private static final String INVOICE_FIELD = "invoice";
    private static final String SUCCESSFUL_PAYMENT_FIELD = "successful_payment";

    @JsonProperty(value = MESSAGE_ID_FIELD)
    private Integer messageId;
    @JsonProperty(value = FROM_FIELD)
    private User from;
    @JsonProperty(value = DATE_FIELD)
    private Integer date;
    @JsonProperty(value = CHAT_FIELD)
    private Chat chat;
    @JsonProperty(value = FORWARD_FROM_FIELD)
    private User forwardFrom;
    @JsonProperty(value = FORWARD_FROM_CHAT_FIELD)
    private Chat forwardFromChat;
    @JsonProperty(value = FORWARD_FROM_MESSAGE_ID_FIELD)
    private Integer forwardFromMessageId;
    @JsonProperty(value = FORWARD_DATE_FIELD)
    private Integer forwardDate;
    @JsonProperty(value = REPLY_TO_MESSAGE_FIELD)
    private Message replyToMessage;
    @JsonProperty(value = EDIT_DATE_FIELD)
    private Integer editDate;
    @JsonProperty(value = TEXT_FIELD)
    private String text;
    @JsonProperty(value = ENTITIES_FIELD)
    private List<MessageEntity> entities;
    @JsonProperty(value = AUDIO_FIELD)
    private Audio audio;
    @JsonProperty(value = DOCUMENT_FIELD)
    private Document document;
    @JsonProperty(value = GAME_FIELD)
    private Game game;
    @JsonProperty(value = PHOTO_FIELD)
    private List<PhotoSize> photo;
    @JsonProperty(value = STICKER_FIELD)
    private Sticker sticker;
    @JsonProperty(value = VIDEO_FIELD)
    private Video video;
    @JsonProperty(value = VOICE_FIELD)
    private Voice voice;
    @JsonProperty(value = VIDEO_NOTE_FIELD)
    private VideoNote videoNote;
    @JsonProperty(value = NEW_CHAT_MEMBERS_FIELD)
    private List<User> newChatMembers;
    @JsonProperty(value = CAPTION_FIELD)
    private String caption;
    @JsonProperty(value = CONTACT_FIELD)
    private Contact contact;
    @JsonProperty(value = LOCATION_FIELD)
    private Location location;
    @JsonProperty(value = VENUE_FIELD)
    private Venue venue;
    @JsonProperty(value = NEW_CHAT_MEMBER_FIELD)
    private User newChatMember;
    @JsonProperty(value = LEFT_CHAT_MEMBER_FIELD)
    private User leftChatMember;
    @JsonProperty(value = NEW_CHAT_TITLE_FIELD)
    private String newChatTitle;
    @JsonProperty(value = NEW_CHAT_PHOTO_FIELD)
    private List<PhotoSize> newChatPhoto;
    @JsonProperty(value = DELETE_CHAT_PHOTO_FIELD)
    private Boolean deleteChatPhoto;
    @JsonProperty(value = GROUP_CHAT_CREATED_FIELD)
    private Boolean groupChatCreated;
    @JsonProperty(value = SUPERGROUP_CHAT_CREATED_FIELD)
    private Boolean supergroupChatCreated;
    @JsonProperty(value = CHANNEL_CHAT_CREATED_FIELD)
    private Boolean channelChatCreated;
    @JsonProperty(value = MIGRATE_TO_CHAT_ID_FIELD)
    private Integer migrateToChatId;
    @JsonProperty(value = MIGRATE_FROM_CHAT_ID_FIELD)
    private Integer migrateFromChatId;
    @JsonProperty(value = PINNED_MESSAGE_FIELD)
    private Message pinnedMessage;
    @JsonProperty(value = INVOICE_FIELD)
    private Invoice invoice;
    @JsonProperty(value = SUCCESSFUL_PAYMENT_FIELD)
    private String successfulPayment;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public User getForwardFrom() {
        return forwardFrom;
    }

    public void setForwardFrom(User forwardFrom) {
        this.forwardFrom = forwardFrom;
    }

    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    public void setForwardFromChat(Chat forwardFromChat) {
        this.forwardFromChat = forwardFromChat;
    }

    public Integer getForwardFromMessageId() {
        return forwardFromMessageId;
    }

    public void setForwardFromMessageId(Integer forwardFromMessageId) {
        this.forwardFromMessageId = forwardFromMessageId;
    }

    public Integer getForwardDate() {
        return forwardDate;
    }

    public void setForwardDate(Integer forwardDate) {
        this.forwardDate = forwardDate;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public void setReplyToMessage(Message replyToMessage) {
        this.replyToMessage = replyToMessage;
    }

    public Integer getEditDate() {
        return editDate;
    }

    public void setEditDate(Integer editDate) {
        this.editDate = editDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public VideoNote getVideoNote() {
        return videoNote;
    }

    public void setVideoNote(VideoNote videoNote) {
        this.videoNote = videoNote;
    }

    public List<User> getNewChatMembers() {
        return newChatMembers;
    }

    public void setNewChatMembers(List<User> newChatMembers) {
        this.newChatMembers = newChatMembers;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public User getNewChatMember() {
        return newChatMember;
    }

    public void setNewChatMember(User newChatMember) {
        this.newChatMember = newChatMember;
    }

    public User getLeftChatMember() {
        return leftChatMember;
    }

    public void setLeftChatMember(User leftChatMember) {
        this.leftChatMember = leftChatMember;
    }

    public String getNewChatTitle() {
        return newChatTitle;
    }

    public void setNewChatTitle(String newChatTitle) {
        this.newChatTitle = newChatTitle;
    }

    public List<PhotoSize> getNewChatPhoto() {
        return newChatPhoto;
    }

    public void setNewChatPhoto(List<PhotoSize> newChatPhoto) {
        this.newChatPhoto = newChatPhoto;
    }

    public Boolean getDeleteChatPhoto() {
        return deleteChatPhoto;
    }

    public void setDeleteChatPhoto(Boolean deleteChatPhoto) {
        this.deleteChatPhoto = deleteChatPhoto;
    }

    public Boolean getGroupChatCreated() {
        return groupChatCreated;
    }

    public void setGroupChatCreated(Boolean groupChatCreated) {
        this.groupChatCreated = groupChatCreated;
    }

    public Boolean getSupergroupChatCreated() {
        return supergroupChatCreated;
    }

    public void setSupergroupChatCreated(Boolean supergroupChatCreated) {
        this.supergroupChatCreated = supergroupChatCreated;
    }

    public Boolean getChannelChatCreated() {
        return channelChatCreated;
    }

    public void setChannelChatCreated(Boolean channelChatCreated) {
        this.channelChatCreated = channelChatCreated;
    }

    public Integer getMigrateToChatId() {
        return migrateToChatId;
    }

    public void setMigrateToChatId(Integer migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
    }

    public Integer getMigrateFromChatId() {
        return migrateFromChatId;
    }

    public void setMigrateFromChatId(Integer migrateFromChatId) {
        this.migrateFromChatId = migrateFromChatId;
    }

    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public void setPinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getSuccessfulPayment() {
        return successfulPayment;
    }

    public void setSuccessfulPayment(String successfulPayment) {
        this.successfulPayment = successfulPayment;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", from=" + from +
                ", date=" + date +
                ", chat=" + chat +
                ", forwardFrom=" + forwardFrom +
                ", forwardFromChat=" + forwardFromChat +
                ", forwardFromMessageId=" + forwardFromMessageId +
                ", forwardDate=" + forwardDate +
                ", replyToMessage=" + replyToMessage +
                ", editDate=" + editDate +
                ", text='" + text + '\'' +
                ", entities=" + entities +
                ", audio=" + audio +
                ", document=" + document +
                ", game=" + game +
                ", photo=" + photo +
                ", sticker=" + sticker +
                ", video=" + video +
                ", voice=" + voice +
                ", videoNote=" + videoNote +
                ", newChatMembers=" + newChatMembers +
                ", caption='" + caption + '\'' +
                ", contact=" + contact +
                ", location=" + location +
                ", venue=" + venue +
                ", newChatMember=" + newChatMember +
                ", leftChatMember=" + leftChatMember +
                ", newChatTitle='" + newChatTitle + '\'' +
                ", newChatPhoto=" + newChatPhoto +
                ", deleteChatPhoto=" + deleteChatPhoto +
                ", groupChatCreated=" + groupChatCreated +
                ", supergroupChatCreated=" + supergroupChatCreated +
                ", channelChatCreated=" + channelChatCreated +
                ", migrateToChatId=" + migrateToChatId +
                ", migrateFromChatId=" + migrateFromChatId +
                ", pinnedMessage=" + pinnedMessage +
                ", invoice=" + invoice +
                ", successfulPayment='" + successfulPayment + '\'' +
                '}';
    }
}
