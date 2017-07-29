package com.rsm.objectorientationwithrpg.model.hero;

public class Shaman extends Hero {

    public Shaman(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.vitality = 60;
        this.stamina = 125;
        this.strength = 1;
        this.dexterity = 2;
        this.endurance = 1;
        this.intelligence = 3;
        this.agility = 1;
        this.alertness = 2;
        this.luck = 2;
        this.states = States.IDLE;
    }
}
