package com.rsm.charactergenerator.service;

import com.rsm.charactergenerator.model.Character;
import com.rsm.charactergenerator.model.Gender;

public class ImageService {

    public static String setImageCharacter(Character character) {
        if (Gender.MALE.equals(character.getGender())) {
            switch (character.getBreed()) {
                case ALCHEMIST:
                    return "/resources/static/images/alch-m.jpg";
                case ASSASSIN:
                    return "/resources/static/images/assa-m.jpg";
                case BARBARIAN:
                    return "/resources/static/images/barb-m.jpg";
                case BARD:
                    return "/resources/static/images/bard-m.jpǵ";
                case CLERIC:
                    return "/resources/static/images/cler.m.jpg";
                case DRUID:
                    return "/resources/static/images/drui-m.jpg";
                case ELF:
                    return "/resources/static/images/elf-m.jpg";
                case KHAJIIT:
                    return "/resources/static/images/khaj-m.jpg";
                case LANCER:
                    return "/resources/static/images/lanc-m.jpg";
                case MAGICIAN:
                    return "/resources/static/images/magi-m.jpg";
                case MONK:
                    return "/resources/static/images/monk-m.jpg";
                case PIRATE:
                    return "/resources/static/images/pira-m.jpg";
                case RANGER:
                    return "/resources/static/images/rang-m.jpg";
                case REPTILIAN:
                    return "/resources/static/images/rept-m.jpg";
                case ROGUE:
                    return "/resources/static/images/rogu-m.jpg";
                case SHAMAN:
                    return "/resources/static/images/sham-m.jpg";
                case THIEF:
                    return "/resources/static/images/thie-m.jpg";
                case WARRIOR:
                    return "/resources/static/images/warr-m.jpg";
                default:
                    return "No Male image found.";
            }
        } else {
            switch (character.getBreed()) {
                case ALCHEMIST:
                    return "/resources/static/images/alch-f.jpg";
                case ASSASSIN:
                    return "/resources/static/images/assa-f.jpg";
                case BARBARIAN:
                    return "/resources/static/images/barb-f.jpg";
                case BARD:
                    return "/resources/static/images/bard-f.jpg";
                case CLERIC:
                    return "/resources/static/images/cler-f.jpg";
                case DRUID:
                    return "/resources/static/images/drui-f.jpg";
                case ELF:
                    return "/resources/static/images/elf-f.jpg";
                case KHAJIIT:
                    return "/resources/static/images/khaj-f.jpg";
                case LANCER:
                    return "/resources/static/images/lanc-f.jpg";
                case MAGICIAN:
                    return "/resources/static/images/magi-f.jpg";
                case MONK:
                    return "/resources/static/images/monk-f.jpg";
                case PIRATE:
                    return "/resources/static/images/pira-f.jpg";
                case RANGER:
                    return "/resources/static/images/rang-f.jpg";
                case REPTILIAN:
                    return "/resources/static/images/rept-f.jpg";
                case ROGUE:
                    return "/resources/static/images/rogu-f.jpg";
                case SHAMAN:
                    return "/resources/static/images/sham-f.jpg";
                case THIEF:
                    return "/resources/static/images/thie-f.jpg";
                case WARRIOR:
                    return "/resources/static/images/warr-f.jpg";
                default:
                    return "No Female image found.";
            }
        }
    }
}
