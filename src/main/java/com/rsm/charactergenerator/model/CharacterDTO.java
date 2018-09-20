package com.rsm.charactergenerator.model;

public class CharacterDTO {

    private String name;
    private Gender gender;
    private Breed breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}
