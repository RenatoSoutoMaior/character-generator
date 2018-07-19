package com.rsm.charactergenerator.model;

public enum Breed {

    ALCHEMIST("Alchemist", new Attributes(50L, 5L, 8L, 8L, 15L, 8L, 7L, 5L)),
    ASSASSIN("Assassin", new Attributes(80L, 10L, 10L, 12L, 10L, 2L, 20L, 8L)),
    BARBARIAN("Barbarian", new Attributes(100L, 30L, 5L, 2L, 2L, 2L, 5L, 3L)),
    BARD("Bard", new Attributes(40L, 5L, 8L, 8L, 15L, 20L, 8L, 20L)),
    CLERIC("Cleric", new Attributes(40L, 4L, 6L, 5L, 20L, 10L, 8L, 10L)),
    DRUID("Druid", new Attributes(60L, 8L, 8L, 10L, 12L, 10L, 10L, 8L)),
    ELF("Elf", new Attributes(70L, 10L, 10L, 15L, 14L, 5L, 12L, 10L)),
    KHAJIIT("Khajiit", new Attributes(65L, 15L, 8L, 25L, 8L, 3L, 15L, 15L)),
    LANCER("Lancer", new Attributes(90L, 20L, 10L, 10L, 5L, 5L, 7L, 4L)),
    MAGICIAN("Magician", new Attributes(70L, 8L, 5L, 13L, 18L, 8L, 8L, 10L)),
    MONK("Monk", new Attributes(85L, 25L, 10L, 15L, 12L, 5L, 13L, 13L)),
    PIRATE("Pirate", new Attributes(95L, 15L, 5L, 10L, 5L, 7L, 8L, 8L)),
    RANGER("Ranger", new Attributes(70L, 10L, 10L, 20L, 8L, 6L, 15L, 7L)),
    REPTILIAN("Reptilian", new Attributes(100L, 20L, 25L, 10L, 2L, 1L, 6L, 2L)),
    ROGUE("Rogue", new Attributes(60L, 8L, 10L, 12L, 9L, 3L, 12L, 14L)),
    SHAMAN("Shaman", new Attributes(40L, 8L, 5L, 8L, 15L, 7L, 10L, 10L)),
    THIEF("Thief", new Attributes(50L, 10L, 10L, 10L, 10L, 8L, 13L, 9L)),
    WARRIOR("Warrior", new Attributes(100L, 20L, 15L, 5L, 5L, 5L, 8L, 7L));

    private String name;
    private Attributes attributes;

    Breed(String name, Attributes attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public Attributes getAttributes() {
        return attributes;
    }
}
