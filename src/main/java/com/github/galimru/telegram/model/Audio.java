package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Audio implements Serializable {
    private static final long serialVersionUID = -7217096160179432813L;

    private static final String FILE_ID_FIELD = "file_id";
    private static final String DURATION_FIELD = "duration";
    private static final String PERFORMER_FIELD = "performer";
    private static final String TITLE_FIELD = "title";
    private static final String MIME_TYPE_FIELD = "mime_type";
    private static final String FILE_SIZE_FIELD = "file_size";

    @JsonProperty(value = FILE_ID_FIELD)
    private String fileId;
    @JsonProperty(value = DURATION_FIELD)
    private Integer duration;
    @JsonProperty(value = PERFORMER_FIELD)
    private String performer;
    @JsonProperty(value = TITLE_FIELD)
    private String title;
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "Audio{" +
                "fileId='" + fileId + '\'' +
                ", duration=" + duration +
                ", performer='" + performer + '\'' +
                ", title='" + title + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}
