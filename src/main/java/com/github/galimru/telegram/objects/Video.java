package com.github.galimru.telegram.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Video implements Serializable {
    private static final long serialVersionUID = 3832338317440985444L;

    private static final String FILE_ID_FIELD = "file_id";
    private static final String WIDTH_FIELD = "width";
    private static final String HEIGHT_FIELD = "height";
    private static final String DURATION_FIELD = "duration";
    private static final String THUMB_FIELD = "thumb";
    private static final String MIME_TYPE_FIELD = "mime_type";
    private static final String FILE_SIZE_FIELD = "file_size";

    @JsonProperty(value = FILE_ID_FIELD)
    private String fileId;
    @JsonProperty(value = WIDTH_FIELD)
    private Integer width;
    @JsonProperty(value = HEIGHT_FIELD)
    private Integer height;
    @JsonProperty(value = DURATION_FIELD)
    private Integer duration;
    @JsonProperty(value = THUMB_FIELD)
    private PhotoSize thumb;
    @JsonProperty(value = MIME_TYPE_FIELD)
    private String mimeType;
    @JsonProperty(value = FILE_SIZE_FIELD)
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public Video setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public Video setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Video setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public Video setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public Video setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Video setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public Video setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    @Override
    public String toString() {
        return "Video{" +
                "fileId='" + fileId + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", duration=" + duration +
                ", thumb=" + thumb +
                ", mimeType='" + mimeType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}
