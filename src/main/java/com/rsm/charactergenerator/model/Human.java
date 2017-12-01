package com.rsm.charactergenerator.model;

import com.rsm.charactergenerator.model.profession.Profession;

public class Human {

    private String name;
    private Gender gender;
    private SkinColor skinColor;
    private Height height;
    private Weight weight;
    private Profession profession;

    public Human(String name, Gender gender, SkinColor skinColor, Height height,
                 Weight weight, Profession profession) {
        this.name = name;
        this.gender = gender;
        this.skinColor = skinColor;
        this.height = height;
        this.weight = weight;
        this.profession = profession;
    }

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

    public SkinColor getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(SkinColor skinColor) {
        this.skinColor = skinColor;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
}