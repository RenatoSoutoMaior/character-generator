package com.rsm.charactergenerator.service;

import com.rsm.charactergenerator.model.Character;
import com.rsm.charactergenerator.model.Gender;

class ImageService {

    static String setImageCharacter(Character character) {
        if (Gender.MALE.equals(character.getGender())) {
            switch (character.getBreed()) {
                case ALCHEMIST:
                    return "../images/alch-m.png";
                case ASSASSIN:
                    return "../images/assa-m.png";
                case BARBARIAN:
                    return "../images/barb-m.png";
                case BARD:
                    return "../images/bard-m.jpǵ";
                case CLERIC:
                    return "../images/cler.m.png";
                case DRUID:
                    return "../images/drui-m.png";
                case ELF:
                    return "../images/elf-m.png";
                case KHAJIIT:
                    return "../images/khaj-m.png";
                case LANCER:
                    return "../images/lanc-m.png";
                case MAGICIAN:
                    return "../images/magi-m.png";
                case MONK:
                    return "../images/monk-m.png";
                case PIRATE:
                    return "../images/pira-m.png";
                case RANGER:
                    return "../images/rang-m.png";
                case REPTILIAN:
                    return "../images/rept-m.png";
                case ROGUE:
                    return "../images/rogu-m.png";
                case SHAMAN:
                    return "../images/sham-m.png";
                case THIEF:
                    return "../images/thie-m.png";
                case WARRIOR:
                    return "../images/warr-m.png";
                default:
                    return "No Male image found.";
            }
        } else {
            switch (character.getBreed()) {
                case ALCHEMIST:
                    return "../images/alch-f.png";
                case ASSASSIN:
                    return "../images/assa-f.png";
                case BARBARIAN:
                    return "../images/barb-f.png";
                case BARD:
                    return "../images/bard-f.png";
                case CLERIC:
                    return "../images/cler-f.png";
                case DRUID:
                    return "../images/drui-f.png";
                case ELF:
                    return "../images/elf-f.png";
                case KHAJIIT:
                    return "../images/khaj-f.png";
                case LANCER:
                    return "../images/lanc-f.png";
                case MAGICIAN:
                    return "../images/magi-f.png";
                case MONK:
                    return "../images/monk-f.png";
                case PIRATE:
                    return "../images/pira-f.png";
                case RANGER:
                    return "../images/rang-f.png";
                case REPTILIAN:
                    return "../images/rept-f.png";
                case ROGUE:
                    return "../images/rogu-f.png";
                case SHAMAN:
                    return "../images/sham-f.png";
                case THIEF:
                    return "../images/thie-f.png";
                case WARRIOR:
                    return "../images/warr-f.png";
                default:
                    return "No Female image found.";
            }
        }
    }
}
