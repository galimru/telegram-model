package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Document implements Serializable {
    private static final long serialVersionUID = -4897915095034130989L;

    private static final String FILE_ID_FIELD = "file_id";
    private static final String THUMB_FIELD = "thumb";
    private static final String FILE_NAME_FIELD = "file_name";
    private static final String MIME_TYPE_FIELD = "mime_type";
    private static final String FILE_SIZE_FIELD = "file_size";

    @JsonProperty(value = FILE_ID_FIELD)
    private String fileId;
    @JsonProperty(value = THUMB_FIELD)
    private PhotoSize thumb;
    @JsonProperty(value = FILE_NAME_FIELD)
    private String fileName;
    @JsonProperty(value = MIME_TYPE_FIELD)
    private String mimeType;
    @JsonProperty(value = FILE_SIZE_FIELD)
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public Document setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public Document setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public Document setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Document setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public Document setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    @Override
    public String toString() {
        return "Document{" +
                "fileId='" + fileId + '\'' +
                ", thumb=" + thumb +
                ", fileName='" + fileName + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}
