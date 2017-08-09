package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

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

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
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
