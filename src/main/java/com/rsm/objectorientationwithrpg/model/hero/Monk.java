package com.rsm.objectorientationwithrpg.model.hero;

public class Monk extends Hero {

    public Monk(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.vitality = 100;
        this.stamina = 70;
        this.strength = 3;
        this.dexterity = 2;
        this.endurance = 1;
        this.intelligence = 1;
        this.agility = 2;
        this.alertness = 1;
        this.luck = 1;
    }
}
