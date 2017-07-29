package com.rsm.objectorientationwithrpg.model.hero;

public class Cleric extends Hero {

    public Cleric(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.level = 1;
        this.vitality = 40;
        this.stamina = 160;
        this.strength = 1;
        this.dexterity = 1;
        this.endurance = 1;
        this.intelligence = 3;
        this.agility = 1;
        this.alertness = 3;
        this.luck = 2;
        this.states = States.IDLE;
    }
}
