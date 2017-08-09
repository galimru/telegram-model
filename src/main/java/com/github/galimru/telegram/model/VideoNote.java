package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class VideoNote implements Serializable {
    private static final long serialVersionUID = 9005095926255380328L;

    private static final String FILE_ID_FIELD = "file_id";
    private static final String LENGTH_FIELD = "length";
    private static final String DURATION_FIELD = "duration";
    private static final String THUMB_FIELD = "thumb";
    private static final String FILE_SIZE_FIELD = "file_size";

    @JsonProperty(value = FILE_ID_FIELD)
    private String fileId;
    @JsonProperty(value = LENGTH_FIELD)
    private Integer length;
    @JsonProperty(value = DURATION_FIELD)
    private Integer duration;
    @JsonProperty(value = THUMB_FIELD)
    private PhotoSize thumb;
    @JsonProperty(value = FILE_SIZE_FIELD)
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
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

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "VideoNote{" +
                "fileId='" + fileId + '\'' +
                ", length=" + length +
                ", duration=" + duration +
                ", thumb=" + thumb +
                ", fileSize=" + fileSize +
                '}';
    }
}
