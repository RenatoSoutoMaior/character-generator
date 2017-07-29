package com.rsm.objectorientationwithrpg.model.hero;

public class Assassin extends Hero {

    public Assassin(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.vitality = 60;
        this.stamina = 70;
        this.strength = 1;
        this.dexterity = 2;
        this.endurance = 1;
        this.intelligence = 3;
        this.agility = 3;
        this.alertness = 3;
        this.luck = 1;
        this.states = States.IDLE;
    }
}
