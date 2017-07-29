package com.rsm.objectorientationwithrpg.model.hero;

public class Wizard extends Hero {

    public Wizard(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.vitality = 60;
        this.stamina = 200;
        this.strength = 1;
        this.dexterity = 1;
        this.endurance = 1;
        this.intelligence = 5;
        this.agility = 1;
        this.alertness = 1;
        this.luck = 2;
        this.states = States.IDLE;
    }
}
