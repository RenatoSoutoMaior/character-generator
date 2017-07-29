package com.rsm.objectorientationwithrpg.model.hero;

public class Necromancer extends Hero {

    public Necromancer(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.vitality = 90;
        this.stamina = 120;
        this.strength = 1;
        this.dexterity = 2;
        this.endurance = 1;
        this.intelligence = 3;
        this.agility = 1;
        this.alertness = 1;
        this.luck = 1;
        this.states = States.IDLE;
    }
}
