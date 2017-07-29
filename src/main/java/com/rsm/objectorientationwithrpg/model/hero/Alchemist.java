package com.rsm.objectorientationwithrpg.model.hero;

public class Alchemist extends Hero {

    public Alchemist(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.level = 1;
        this.vitality = 50;
        this.stamina = 110;
        this.strength = 1;
        this.dexterity = 2;
        this.endurance = 1;
        this.intelligence = 3;
        this.agility = 1;
        this.alertness = 1;
        this.luck = 2;
        this.states = States.IDLE;
    }
}
