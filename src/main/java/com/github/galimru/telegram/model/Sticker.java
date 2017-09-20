package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sticker implements Serializable {
    private static final long serialVersionUID = 5316284251439704226L;

    private static final String FILE_ID_FIELD = "file_id";
    private static final String WIDTH_FIELD = "width";
    private static final String HEIGHT_FIELD = "height";
    private static final String THUMB_FIELD = "thumb";
    private static final String EMOJI_FIELD = "emoji";
    private static final String SET_NAME_FIELD = "set_name";
    private static final String MASK_POSITION_FIELD = "mask_position";
    private static final String FILE_SIZE_FIELD = "file_size";

    @JsonProperty(value = FILE_ID_FIELD)
    private String fileId;
    @JsonProperty(value = WIDTH_FIELD)
    private Integer width;
    @JsonProperty(value = HEIGHT_FIELD)
    private Integer height;
    @JsonProperty(value = THUMB_FIELD)
    private PhotoSize thumb;
    @JsonProperty(value = EMOJI_FIELD)
    private String emoji;
    @JsonProperty(value = SET_NAME_FIELD)
    private String setName;
    @JsonProperty(value = MASK_POSITION_FIELD)
    private MaskPosition maskPosition;
    @JsonProperty(value = FILE_SIZE_FIELD)
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public Sticker setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public Sticker setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Sticker setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public Sticker setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    public String getEmoji() {
        return emoji;
    }

    public Sticker setEmoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    public String getSetName() {
        return setName;
    }

    public Sticker setSetName(String setName) {
        this.setName = setName;
        return this;
    }

    public MaskPosition getMaskPosition() {
        return maskPosition;
    }

    public Sticker setMaskPosition(MaskPosition maskPosition) {
        this.maskPosition = maskPosition;
        return this;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public Sticker setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "fileId='" + fileId + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", thumb=" + thumb +
                ", emoji='" + emoji + '\'' +
                ", setName='" + setName + '\'' +
                ", maskPosition=" + maskPosition +
                ", fileSize=" + fileSize +
                '}';
    }
}
