package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Animation implements Serializable {
    private static final long serialVersionUID = 5734939048630147740L;

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

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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
        return "Animation{" +
                "fileId='" + fileId + '\'' +
                ", thumb=" + thumb +
                ", fileName='" + fileName + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}
