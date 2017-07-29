package com.rsm.objectorientationwithrpg.model;

public class Human extends Hero {

    public Human(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.vitality = 100;
        this.stamina = 100;
        this.strength = 1;
        this.dexterity = 1;
        this.endurance = 1;
        this.intelligence = 1;
        this.agility = 1;
        this.alertness = 1;
        this.states = States.IDLE;
    }
}
