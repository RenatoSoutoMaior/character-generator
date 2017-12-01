package com.rsm.charactergenerator.model;

public enum Weight {

    VERY_SKINNY("Very skinny"),
    SKINNY("Skinny"),
    MEDIUM("Medium"),
    FAT("Fat"),
    VERY_FAT("Very fat");

    private String description;

    Weight(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
