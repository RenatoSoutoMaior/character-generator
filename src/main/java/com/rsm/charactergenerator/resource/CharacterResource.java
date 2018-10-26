package com.rsm.charactergenerator.resource;

import com.rsm.charactergenerator.model.Character;
import com.rsm.charactergenerator.model.CharacterDTO;
import com.rsm.charactergenerator.service.CharacterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Objects.isNull;

@RestController
public class CharacterResource {

    private final Logger log = LoggerFactory.getLogger(CharacterResource.class);

    private CharacterService characterService;

    @Autowired
    public CharacterResource(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/characters")
    public ResponseEntity<Object> getCharacters() {
        List<Character> characters = characterService.getAll();

        if (characters.isEmpty()) {
            log.warn("No Characters found.");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        log.info(characters.size() > 1 ? "Characters found successfully." : "Character successfully found.");
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }

    @GetMapping("/characters/{id}")
    public ResponseEntity<Object> getCharacter(@PathVariable("id") Long id) {
        Character character = characterService.get(id);

        if (isNull(character)) {
            log.warn("No Character found with ID " + id + ".");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        log.info("Character created successfully.");
        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    @PostMapping(value = "/characters", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createCharacter(@RequestBody CharacterDTO characterDTO) {
        if (isNull(characterDTO.getName()) || isNull(characterDTO.getGender()) || isNull(characterDTO.getBreed())) {
            log.warn("Error trying to create a new Character. Please check data included.");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        characterService.create(characterDTO);
        log.info("New Character created successfully.");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/characters/{id}")
    public ResponseEntity<Object> deleteCharacter(@PathVariable Long id) {
        if (isNull(characterService.get(id))) {
            log.warn("No Character found with ID " + id + ".");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        characterService.delete(id);
        log.info("Character with id " + id + " successfully removed.");
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/characters/{id}")
    public ResponseEntity<Object> updateCharacter(@PathVariable Long id, @RequestBody CharacterDTO characterDTO) {
        if (isNull(characterService.get(id))) {
            log.warn("No Character found with ID " + id + ".");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        characterService.update(id, characterDTO);
        log.info("Successfully " + id + " update.");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/random-character")
    public ResponseEntity<Object> randomCharacter() {
        characterService.randomCharacter();
        log.info("New Character created successfully.");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
