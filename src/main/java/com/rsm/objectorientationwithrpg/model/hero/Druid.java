package com.rsm.objectorientationwithrpg.model.hero;

public class Druid extends Hero {

    public Druid(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.level = 1;
        this.vitality = 80;
        this.stamina = 150;
        this.strength = 1;
        this.dexterity = 2;
        this.endurance = 1;
        this.intelligence = 2;
        this.agility = 1;
        this.alertness = 1;
        this.luck = 1;
        this.states = States.IDLE;
    }
}
