package com.rsm.objectorientationwithrpg.model.hero;

public class Bard extends Hero {

    public Bard(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.vitality = 150;
        this.stamina = 50;
        this.strength = 1;
        this.dexterity = 2;
        this.endurance = 1;
        this.intelligence = 2;
        this.agility = 2;
        this.alertness = 1;
        this.luck = 2;
        this.states = States.IDLE;
    }
}
