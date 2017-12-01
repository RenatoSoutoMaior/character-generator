package com.rsm.charactergenerator.model;

public enum SkinColor {

    VERY_CLEAR("Very clear", "#ffdbac"),
    CLEAR("Very clear", "#f1c27d"),
    MEDIUM("Medium", "#c68642"),
    DARK("Dark", "#8d5524"),
    VERY_DARK("Very dark", "#3e2b13");

    private String description;
    private String hexColor;

    SkinColor(String description, String hexColor) {
        this.description = description;
        this.hexColor = hexColor;
    }

    public String getDescription() {
        return description;
    }

    public String getHexColor() {
        return hexColor;
    }
}
