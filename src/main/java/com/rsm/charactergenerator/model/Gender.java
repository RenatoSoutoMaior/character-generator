package com.rsm.charactergenerator.model;

public enum Gender {

    MALE("Male"), FEMALE("Female");

    Gender(String gender) {
        this.gender = gender;
    }

    private String gender;

    public String getGender() {
        return gender;
    }
}
