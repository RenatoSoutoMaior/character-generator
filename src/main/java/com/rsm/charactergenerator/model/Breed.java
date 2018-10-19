package com.rsm.charactergenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum Breed {

    ALCHEMIST("Alchemist"),
    ASSASSIN("Assassin"),
    BARBARIAN("Barbarian"),
    BARD("Bard"),
    CLERIC("Cleric"),
    DRUID("Druid"),
    ELF("Elf"),
    KHAJIIT("Khajiit"),
    LANCER("Lancer"),
    MAGICIAN("Magician"),
    MONK("Monk"),
    PIRATE("Pirate"),
    RANGER("Ranger"),
    REPTILIAN("Reptilian"),
    ROGUE("Rogue"),
    SHAMAN("Shaman"),
    THIEF("Thief"),
    WARRIOR("Warrior");

    private String name;

    Breed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
