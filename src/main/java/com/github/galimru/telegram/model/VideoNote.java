package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public VideoNote setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public VideoNote setLength(Integer length) {
        this.length = length;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public VideoNote setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public VideoNote setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public VideoNote setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
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
