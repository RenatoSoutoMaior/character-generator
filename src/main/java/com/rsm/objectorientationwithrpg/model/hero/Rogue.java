package com.rsm.objectorientationwithrpg.model.hero;

public class Rogue extends Hero {

    public Rogue(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.vitality = 120;
        this.stamina = 80;
        this.strength = 1;
        this.dexterity = 2;
        this.endurance = 1;
        this.intelligence = 1;
        this.agility = 2;
        this.alertness = 4;
        this.luck = 1;
        this.states = States.IDLE;
    }
}
