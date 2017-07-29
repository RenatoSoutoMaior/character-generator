package com.rsm.objectorientationwithrpg.model.hero;

public class Dwarf extends Hero {

    public Dwarf(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.level = 1;
        this.vitality = 90;
        this.stamina = 40;
        this.strength = 3;
        this.dexterity = 2;
        this.endurance = 2;
        this.intelligence = 1;
        this.agility = 1;
        this.alertness = 1;
        this.luck = 2;
        this.states = States.IDLE;
    }
}
