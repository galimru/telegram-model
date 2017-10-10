package com.github.galimru.telegram.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MaskPosition implements Serializable {
    private static final long serialVersionUID = 8759623172272812930L;

    private static final String POINT_FIELD = "point";
    private static final String X_SHIFT_FIELD = "x_shift";
    private static final String Y_SHIFT_FIELD = "y_shift";
    private static final String SCALE_FIELD = "scale";

    @JsonProperty(value = POINT_FIELD)
    private String point;
    @JsonProperty(value = X_SHIFT_FIELD)
    private Float xShift;
    @JsonProperty(value = Y_SHIFT_FIELD)
    private Float yShift;
    @JsonProperty(value = SCALE_FIELD)
    private Float scale;

    public String getPoint() {
        return point;
    }

    public MaskPosition setPoint(String point) {
        this.point = point;
        return this;
    }

    public Float getxShift() {
        return xShift;
    }

    public MaskPosition setxShift(Float xShift) {
        this.xShift = xShift;
        return this;
    }

    public Float getyShift() {
        return yShift;
    }

    public MaskPosition setyShift(Float yShift) {
        this.yShift = yShift;
        return this;
    }

    public Float getScale() {
        return scale;
    }

    public MaskPosition setScale(Float scale) {
        this.scale = scale;
        return this;
    }

    @Override
    public String toString() {
        return "MaskPosition{" +
                "point='" + point + '\'' +
                ", xShift=" + xShift +
                ", yShift=" + yShift +
                ", scale=" + scale +
                '}';
    }
}
