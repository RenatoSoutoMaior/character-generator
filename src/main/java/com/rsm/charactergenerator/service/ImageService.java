package com.rsm.charactergenerator.service;

import com.rsm.charactergenerator.model.CharacterDTO;
import com.rsm.charactergenerator.model.Gender;

class ImageService {

    static String setImageCharacter(CharacterDTO characterDTO) {
        if (Gender.MALE.equals(characterDTO.getGender())) {
            switch (characterDTO.getBreed()) {
                case ALCHEMIST:
                    return "/resources/static/images/alch-m.png";
                case ASSASSIN:
                    return "/resources/static/images/assa-m.png";
                case BARBARIAN:
                    return "/resources/static/images/barb-m.png";
                case BARD:
                    return "/resources/static/images/bard-m.jpǵ";
                case CLERIC:
                    return "/resources/static/images/cler.m.png";
                case DRUID:
                    return "/resources/static/images/drui-m.png";
                case ELF:
                    return "/resources/static/images/elf-m.png";
                case KHAJIIT:
                    return "/resources/static/images/khaj-m.png";
                case LANCER:
                    return "/resources/static/images/lanc-m.png";
                case MAGICIAN:
                    return "/resources/static/images/magi-m.png";
                case MONK:
                    return "/resources/static/images/monk-m.png";
                case PIRATE:
                    return "/resources/static/images/pira-m.png";
                case RANGER:
                    return "/resources/static/images/rang-m.png";
                case REPTILIAN:
                    return "/resources/static/images/rept-m.png";
                case ROGUE:
                    return "/resources/static/images/rogu-m.png";
                case SHAMAN:
                    return "/resources/static/images/sham-m.png";
                case THIEF:
                    return "/resources/static/images/thie-m.png";
                case WARRIOR:
                    return "/resources/static/images/warr-m.png";
                default:
                    return "No Male image found.";
            }
        } else if (Gender.FEMALE.equals(characterDTO.getGender())) {
            switch (characterDTO.getBreed()) {
                case ALCHEMIST:
                    return "/resources/static/images/alch-f.png";
                case ASSASSIN:
                    return "/resources/static/images/assa-f.png";
                case BARBARIAN:
                    return "/resources/static/images/barb-f.png";
                case BARD:
                    return "/resources/static/images/bard-f.png";
                case CLERIC:
                    return "/resources/static/images/cler-f.png";
                case DRUID:
                    return "/resources/static/images/drui-f.png";
                case ELF:
                    return "/resources/static/images/elf-f.png";
                case KHAJIIT:
                    return "/resources/static/images/khaj-f.png";
                case LANCER:
                    return "/resources/static/images/lanc-f.png";
                case MAGICIAN:
                    return "/resources/static/images/magi-f.png";
                case MONK:
                    return "/resources/static/images/monk-f.png";
                case PIRATE:
                    return "/resources/static/images/pira-f.png";
                case RANGER:
                    return "/resources/static/images/rang-f.png";
                case REPTILIAN:
                    return "/resources/static/images/rept-f.png";
                case ROGUE:
                    return "/resources/static/images/rogu-f.png";
                case SHAMAN:
                    return "/resources/static/images/sham-f.png";
                case THIEF:
                    return "/resources/static/images/thie-f.png";
                case WARRIOR:
                    return "/resources/static/images/warr-f.png";
                default:
                    return "No Female image found.";
            }
        } else {
            switch (characterDTO.getBreed()) {
                default:
                    return "No image found.";
            }
        }
    }
}
