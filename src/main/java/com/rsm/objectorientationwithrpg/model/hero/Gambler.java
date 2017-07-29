package com.rsm.objectorientationwithrpg.model.hero;

public class Gambler extends Hero {

    public Gambler(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.level = 1;
        this.vitality = 60;
        this.stamina = 60;
        this.strength = 1;
        this.dexterity = 1;
        this.endurance = 1;
        this.intelligence = 2;
        this.agility = 1;
        this.alertness = 3;
        this.luck = 5;
        this.states = States.IDLE;
    }
}
