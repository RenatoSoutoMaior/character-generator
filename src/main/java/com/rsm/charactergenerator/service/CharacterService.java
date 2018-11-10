package com.rsm.charactergenerator.service;

import com.rsm.charactergenerator.model.Breed;
import com.rsm.charactergenerator.model.Character;
import com.rsm.charactergenerator.model.CharacterDTO;
import com.rsm.charactergenerator.model.Gender;
import com.rsm.charactergenerator.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<Character> getAll() {
        return characterRepository.findAll();
    }

    public Character get(Long id) {
        return characterRepository.findOne(id);
    }

    public void create(CharacterDTO characterDTO) {
        Character character = new Character(characterDTO);
        character.setImage(ImageService.setImageCharacter(characterDTO));
        characterRepository.save(character);
    }

    public void randomCharacter() {
        CharacterDTO characterDTO = new CharacterDTO();
        characterDTO.setBreed(Breed.randomBreed());
        characterDTO.setGender(Gender.randomGender());
        characterDTO.setName(RandomService.randomName(characterDTO.getGender()));
        characterDTO.setImage(ImageService.setImageCharacter(characterDTO));

        characterRepository.save(new Character(characterDTO));
    }

    public void delete(Long id) {
        characterRepository.delete(id);
    }

    public void deleteAll() {
        characterRepository.deleteAll();
    }
}
