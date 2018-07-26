package com.rsm.charactergenerator.service;

import com.rsm.charactergenerator.model.Character;
import com.rsm.charactergenerator.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        character.setImage(ImageService.setImageCharacter(character));
        characterRepository.save(character);
    }

    public void delete(Long id) {
        characterRepository.delete(id);
    }
}
