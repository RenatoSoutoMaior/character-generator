package com.rsm.objectorientationwithrpg.model.hero;

public class Paladin extends Hero {

    public Paladin(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.vitality = 150;
        this.stamina = 20;
        this.strength = 3;
        this.dexterity = 1;
        this.endurance = 3;
        this.intelligence = 1;
        this.agility = 1;
        this.alertness = 1;
        this.luck = 1;
        this.states = States.IDLE;
    }
}
