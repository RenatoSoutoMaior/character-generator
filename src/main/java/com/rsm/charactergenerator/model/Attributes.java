package com.rsm.charactergenerator.model;

public class Attributes {

    private Long vitality;
    private Long strength;
    private Long defense;
    private Long dexterity;
    private Long intelligence;
    private Long charisma;
    private Long perception;
    private Long luck;

    Attributes(Long vitality, Long strength, Long defense, Long dexterity, Long intelligence, Long charisma, Long perception, Long luck) {
        this.vitality = vitality;
        this.strength = strength;
        this.defense = defense;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.perception = perception;
        this.luck = luck;
    }

    public Long getVitality() {
        return vitality;
    }

    public void setVitality(Long vitality) {
        this.vitality = vitality;
    }

    public Long getStrength() {
        return strength;
    }

    public void setStrength(Long strength) {
        this.strength = strength;
    }

    public Long getDefense() {
        return defense;
    }

    public void setDefense(Long defense) {
        this.defense = defense;
    }

    public Long getDexterity() {
        return dexterity;
    }

    public void setDexterity(Long dexterity) {
        this.dexterity = dexterity;
    }

    public Long getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Long intelligence) {
        this.intelligence = intelligence;
    }

    public Long getCharisma() {
        return charisma;
    }

    public void setCharisma(Long charisma) {
        this.charisma = charisma;
    }

    public Long getPerception() {
        return perception;
    }

    public void setPerception(Long perception) {
        this.perception = perception;
    }

    public Long getLuck() {
        return luck;
    }

    public void setLuck(Long luck) {
        this.luck = luck;
    }
}
