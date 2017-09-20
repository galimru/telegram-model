package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public Audio setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public Audio setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public String getPerformer() {
        return performer;
    }

    public Audio setPerformer(String performer) {
        this.performer = performer;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Audio setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Audio setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public Audio setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
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
