package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class PhotoSize implements Serializable {
    private static final long serialVersionUID = -3020020935107108932L;

    private static final String FILE_ID_FIELD = "field_id";
    private static final String WIDTH_FIELD = "width";
    private static final String HEIGHT_FIELD = "height";
    private static final String FILE_SIZE_FIELD = "field_size";

    @JsonProperty(value = FILE_ID_FIELD)
    private String fileId;
    @JsonProperty(value = WIDTH_FIELD)
    private Integer width;
    @JsonProperty(value = HEIGHT_FIELD)
    private Integer height;
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

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "PhotoSize{" +
                "fileId='" + fileId + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", fileSize=" + fileSize +
                '}';
    }
}
