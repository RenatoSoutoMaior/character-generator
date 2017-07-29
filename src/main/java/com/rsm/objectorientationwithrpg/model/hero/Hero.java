package com.rsm.objectorientationwithrpg.model.hero;

import com.rsm.objectorientationwithrpg.model.item.Item;

import java.math.BigDecimal;
import java.util.List;

public abstract class Hero {

    protected String name;

    protected Gender gender;

    protected Integer level = 1;

    protected BigDecimal experience = new BigDecimal(0);

    protected List<Item> items;

    protected Integer vitality;

    protected Integer stamina;

    protected Integer strength;

    protected Integer dexterity;

    protected Integer endurance;

    protected Integer intelligence;

    protected Integer agility;

    protected Integer alertness;

    protected Integer luck;

    protected States states = States.IDLE;

    public void act(States state){
        if(this.states != States.DIE){
            this.setStates(state);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public BigDecimal getExperience() {
        return experience;
    }

    public void setExperience(BigDecimal experience) {
        this.experience = experience;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.getItems().add(item);
    }

    public Integer getVitality() {
        return vitality;
    }

    public void setVitality(Integer vitality) {
        this.vitality = vitality;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getEndurance() {
        return endurance;
    }

    public void setEndurance(Integer endurance) {
        this.endurance = endurance;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getAlertness() {
        return alertness;
    }

    public void setAlertness(Integer alertness) {
        this.alertness = alertness;
    }

    public Integer getLuck() {
        return luck;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }

    public States getStates() {
        return states;
    }

    public void setStates(States states) {
        this.states = states;
    }

}
