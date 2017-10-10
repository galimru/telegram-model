package com.github.galimru.telegram.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Voice implements Serializable {
    private static final long serialVersionUID = -8797092126678575591L;

    private static final String FILE_ID_FIELD = "file_id";
    private static final String DURATION_FIELD = "duration";
    private static final String MIME_TYPE_FIELD = "mime_type";
    private static final String FILE_SIZE_FIELD = "file_size";

    @JsonProperty(value = FILE_ID_FIELD)
    private String fileId;
    @JsonProperty(value = DURATION_FIELD)
    private Integer duration;
    @JsonProperty(value = MIME_TYPE_FIELD)
    private String mimeType;
    @JsonProperty(value = FILE_SIZE_FIELD)
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public Voice setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public Voice setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Voice setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public Voice setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    @Override
    public String toString() {
        return "Voice{" +
                "fileId='" + fileId + '\'' +
                ", duration=" + duration +
                ", mimeType='" + mimeType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}
