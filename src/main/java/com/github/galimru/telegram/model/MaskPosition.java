package com.github.galimru.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

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

    public void setPoint(String point) {
        this.point = point;
    }

    public Float getxShift() {
        return xShift;
    }

    public void setxShift(Float xShift) {
        this.xShift = xShift;
    }

    public Float getyShift() {
        return yShift;
    }

    public void setyShift(Float yShift) {
        this.yShift = yShift;
    }

    public Float getScale() {
        return scale;
    }

    public void setScale(Float scale) {
        this.scale = scale;
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
