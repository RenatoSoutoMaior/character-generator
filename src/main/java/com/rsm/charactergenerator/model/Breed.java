package com.rsm.charactergenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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
    VILLAGER("Villager"),
    WARRIOR("Warrior");

    private static final List<Breed> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final Random RANDOM = new Random();
    private static final int SIZE = VALUES.size();

    private String name;

    Breed(String name) {
        this.name = name;
    }

    public static Breed randomBreed() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public String getName() {
        return name;
    }


}
