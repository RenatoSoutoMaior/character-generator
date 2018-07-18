package com.rsm.charactergenerator.service;

import com.rsm.charactergenerator.model.Character;
import com.rsm.charactergenerator.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.nonNull;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public List<Character> getAll() {
        return characterRepository.findAll();
    }

    public Character get(Long id) {
        return characterRepository.findOne(id);
    }

    public void create(Character character) {
        characterRepository.save(character);
    }

    public void delete(Long id) {
        characterRepository.delete(id);
    }

    public void update(Long id, Character character) {
        Character updatedCharacter = characterRepository.findOne(id);

        if (nonNull(character.getName())) {
            updatedCharacter.setName(character.getName());
        }

        if (nonNull(character.getGender())) {
            updatedCharacter.setGender(character.getGender());
        }

        if (nonNull(character.getImage())) {
            updatedCharacter.setImage(character.getImage());
        }

        characterRepository.save(updatedCharacter);
    }
}
