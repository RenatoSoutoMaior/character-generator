package com.rsm.charactergenerator.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Gender {

    MALE("Male"), FEMALE("Female");

    private static final List<Gender> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final Random RANDOM = new Random();
    private static final int SIZE = VALUES.size();

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public static Gender randomGender() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public String getGender() {
        return gender;
    }
}
