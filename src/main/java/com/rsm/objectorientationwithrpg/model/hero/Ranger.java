package com.rsm.objectorientationwithrpg.model.hero;

public class Ranger extends Hero {

    public Ranger(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.level = 1;
        this.vitality = 70;
        this.stamina = 70;
        this.strength = 1;
        this.dexterity = 1;
        this.endurance = 1;
        this.intelligence = 1;
        this.agility = 3;
        this.alertness = 3;
        this.luck = 1;
        this.states = States.IDLE;
    }
}
