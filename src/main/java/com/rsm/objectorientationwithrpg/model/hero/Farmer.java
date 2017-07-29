package com.rsm.objectorientationwithrpg.model.hero;

public class Farmer extends Hero {

    public Farmer(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.level = 1;
        this.vitality = 100;
        this.stamina = 50;
        this.strength = 1;
        this.dexterity = 1;
        this.endurance = 1;
        this.intelligence = 2;
        this.agility = 1;
        this.alertness = 1;
        this.luck = 3;
        this.states = States.IDLE;
    }
}
