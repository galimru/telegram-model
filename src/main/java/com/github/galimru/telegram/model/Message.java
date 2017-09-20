package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message implements Serializable {
    private static final long serialVersionUID = 4762676246866525581L;

    private static final String MESSAGE_ID_FIELD = "message_id";
    private static final String FROM_FIELD = "from";
    private static final String DATE_FIELD = "date";
    private static final String CHAT_FIELD = "chat";
    private static final String FORWARD_FROM_FIELD = "forward_from";
    private static final String FORWARD_FROM_CHAT_FIELD = "forward_from_chat";
    private static final String FORWARD_FROM_MESSAGE_ID_FIELD = "forward_from_message_id";
    private static final String FORWARD_SIGNATURE_FIELD = "forward_signature";
    private static final String FORWARD_DATE_FIELD = "forward_date";
    private static final String REPLY_TO_MESSAGE_FIELD = "reply_to_message";
    private static final String EDIT_DATE_FIELD = "edit_date";
    private static final String AUTHOR_SIGNATURE_FIELD = "author_signature";
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
    @JsonProperty(value = FORWARD_SIGNATURE_FIELD)
    private String forwardSignature;
    @JsonProperty(value = FORWARD_DATE_FIELD)
    private Integer forwardDate;
    @JsonProperty(value = REPLY_TO_MESSAGE_FIELD)
    private Message replyToMessage;
    @JsonProperty(value = EDIT_DATE_FIELD)
    private Integer editDate;
    @JsonProperty(value = AUTHOR_SIGNATURE_FIELD)
    private String authorSignature;
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

    public Message setMessageId(Integer messageId) {
        this.messageId = messageId;
        return this;
    }

    public User getFrom() {
        return from;
    }

    public Message setFrom(User from) {
        this.from = from;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Message setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Chat getChat() {
        return chat;
    }

    public Message setChat(Chat chat) {
        this.chat = chat;
        return this;
    }

    public User getForwardFrom() {
        return forwardFrom;
    }

    public Message setForwardFrom(User forwardFrom) {
        this.forwardFrom = forwardFrom;
        return this;
    }

    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    public Message setForwardFromChat(Chat forwardFromChat) {
        this.forwardFromChat = forwardFromChat;
        return this;
    }

    public Integer getForwardFromMessageId() {
        return forwardFromMessageId;
    }

    public Message setForwardFromMessageId(Integer forwardFromMessageId) {
        this.forwardFromMessageId = forwardFromMessageId;
        return this;
    }

    public String getForwardSignature() {
        return forwardSignature;
    }

    public Message setForwardSignature(String forwardSignature) {
        this.forwardSignature = forwardSignature;
        return this;
    }

    public Integer getForwardDate() {
        return forwardDate;
    }

    public Message setForwardDate(Integer forwardDate) {
        this.forwardDate = forwardDate;
        return this;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public Message setReplyToMessage(Message replyToMessage) {
        this.replyToMessage = replyToMessage;
        return this;
    }

    public Integer getEditDate() {
        return editDate;
    }

    public Message setEditDate(Integer editDate) {
        this.editDate = editDate;
        return this;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public Message setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
        return this;
    }

    public String getText() {
        return text;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public Message setEntities(List<MessageEntity> entities) {
        this.entities = entities;
        return this;
    }

    public Audio getAudio() {
        return audio;
    }

    public Message setAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public Document getDocument() {
        return document;
    }

    public Message setDocument(Document document) {
        this.document = document;
        return this;
    }

    public Game getGame() {
        return game;
    }

    public Message setGame(Game game) {
        this.game = game;
        return this;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public Message setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
        return this;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Message setSticker(Sticker sticker) {
        this.sticker = sticker;
        return this;
    }

    public Video getVideo() {
        return video;
    }

    public Message setVideo(Video video) {
        this.video = video;
        return this;
    }

    public Voice getVoice() {
        return voice;
    }

    public Message setVoice(Voice voice) {
        this.voice = voice;
        return this;
    }

    public VideoNote getVideoNote() {
        return videoNote;
    }

    public Message setVideoNote(VideoNote videoNote) {
        this.videoNote = videoNote;
        return this;
    }

    public List<User> getNewChatMembers() {
        return newChatMembers;
    }

    public Message setNewChatMembers(List<User> newChatMembers) {
        this.newChatMembers = newChatMembers;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public Message setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public Contact getContact() {
        return contact;
    }

    public Message setContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public Message setLocation(Location location) {
        this.location = location;
        return this;
    }

    public Venue getVenue() {
        return venue;
    }

    public Message setVenue(Venue venue) {
        this.venue = venue;
        return this;
    }

    public User getNewChatMember() {
        return newChatMember;
    }

    public Message setNewChatMember(User newChatMember) {
        this.newChatMember = newChatMember;
        return this;
    }

    public User getLeftChatMember() {
        return leftChatMember;
    }

    public Message setLeftChatMember(User leftChatMember) {
        this.leftChatMember = leftChatMember;
        return this;
    }

    public String getNewChatTitle() {
        return newChatTitle;
    }

    public Message setNewChatTitle(String newChatTitle) {
        this.newChatTitle = newChatTitle;
        return this;
    }

    public List<PhotoSize> getNewChatPhoto() {
        return newChatPhoto;
    }

    public Message setNewChatPhoto(List<PhotoSize> newChatPhoto) {
        this.newChatPhoto = newChatPhoto;
        return this;
    }

    public Boolean getDeleteChatPhoto() {
        return deleteChatPhoto;
    }

    public Message setDeleteChatPhoto(Boolean deleteChatPhoto) {
        this.deleteChatPhoto = deleteChatPhoto;
        return this;
    }

    public Boolean getGroupChatCreated() {
        return groupChatCreated;
    }

    public Message setGroupChatCreated(Boolean groupChatCreated) {
        this.groupChatCreated = groupChatCreated;
        return this;
    }

    public Boolean getSupergroupChatCreated() {
        return supergroupChatCreated;
    }

    public Message setSupergroupChatCreated(Boolean supergroupChatCreated) {
        this.supergroupChatCreated = supergroupChatCreated;
        return this;
    }

    public Boolean getChannelChatCreated() {
        return channelChatCreated;
    }

    public Message setChannelChatCreated(Boolean channelChatCreated) {
        this.channelChatCreated = channelChatCreated;
        return this;
    }

    public Integer getMigrateToChatId() {
        return migrateToChatId;
    }

    public Message setMigrateToChatId(Integer migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
        return this;
    }

    public Integer getMigrateFromChatId() {
        return migrateFromChatId;
    }

    public Message setMigrateFromChatId(Integer migrateFromChatId) {
        this.migrateFromChatId = migrateFromChatId;
        return this;
    }

    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public Message setPinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
        return this;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Message setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }

    public String getSuccessfulPayment() {
        return successfulPayment;
    }

    public Message setSuccessfulPayment(String successfulPayment) {
        this.successfulPayment = successfulPayment;
        return this;
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
                ", forwardSignature='" + forwardSignature + '\'' +
                ", forwardDate=" + forwardDate +
                ", replyToMessage=" + replyToMessage +
                ", editDate=" + editDate +
                ", authorSignature='" + authorSignature + '\'' +
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
