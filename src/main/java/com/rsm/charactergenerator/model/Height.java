package com.rsm.charactergenerator.model;

public enum Height {

    VERY_LOW("Very low"),
    LOW("Low"),
    MEDIUM("Medium"),
    HIGH("High"),
    VERY_HIGH("Very high");

    private String description;

    Height(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
