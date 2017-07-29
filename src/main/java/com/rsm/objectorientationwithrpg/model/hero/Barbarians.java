package com.rsm.objectorientationwithrpg.model.hero;

public class Barbarians extends Hero {

    public Barbarians(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.level = 1;
        this.vitality = 170;
        this.stamina = 20;
        this.strength = 3;
        this.dexterity = 3;
        this.endurance = 1;
        this.intelligence = 1;
        this.agility = 1;
        this.alertness = 1;
        this.luck = 1;
        this.states = States.IDLE;
    }
}
