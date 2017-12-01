package com.rsm.charactergenerator.model;

public class Human {

    private String name;
    private Gender gender;
    private SkinColor skinColor;
    private Height height;
    private Weight weight;
    private Integer legsQuantity = 2;
    private Integer armsQuantity = 2;
    private Integer earsQuantity = 2;
    private Boolean alive = true;

    public Human(String name, Gender gender, SkinColor skinColor, Height height,
                 Weight weight) {
        this.name = name;
        this.gender = gender;
        this.skinColor = skinColor;
        this.height = height;
        this.weight = weight;
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

    public Integer getLegsQuantity() {
        return legsQuantity;
    }

    public void removeLeg() {
        if (this.legsQuantity > 0) {
            this.legsQuantity = this.legsQuantity - 1;
        }
    }

    public Integer getArmsQuantity() {
        return armsQuantity;
    }

    public void removeArm() {
        if (this.armsQuantity > 0) {
            this.armsQuantity = this.armsQuantity - 1;
        }
    }

    public Integer getEarsQuantity() {
        return earsQuantity;
    }

    public void removeEar() {
        if (this.earsQuantity > 0) {
            this.earsQuantity = this.earsQuantity - 1;
        }
    }

    public Boolean isAlive() {
        return alive;
    }

    public void die() {
        this.alive = false;
    }
}
