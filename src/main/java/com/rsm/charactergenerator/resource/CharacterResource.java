package com.rsm.charactergenerator.resource;

import com.rsm.charactergenerator.model.Character;
import com.rsm.charactergenerator.model.Gender;
import com.rsm.charactergenerator.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Objects.isNull;

@RestController
public class CharacterResource {

    private static final String NO_HUMAN_FOUND = "No Character found with ID ";

    @Autowired
    private CharacterService characterService;

    @GetMapping("/characters")
    public ResponseEntity<Object> getCharacters() {

        List<Character> characters = characterService.getAll();

        if (characters.isEmpty()) {
            return new ResponseEntity<>("No Characters found.", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(characters, HttpStatus.OK);
    }

    @GetMapping("/characters/{id}")
    public ResponseEntity<Object> getCharacter(@PathVariable("id") Long id) {

        Character character = characterService.get(id);

        if (isNull(character)) {
            return new ResponseEntity<>(NO_HUMAN_FOUND + id + ".", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    @PostMapping(value = "/characters", consumes = "application/json")
    public ResponseEntity<Object> createCharacter(@RequestParam String name, Gender gender, String image) {

        if (isNull(name) || isNull(gender) || isNull(image)) {
            return new ResponseEntity<>("Error trying to create a new Character. Please check data included.", HttpStatus.BAD_REQUEST);
        }

        characterService.create(new Character(name, gender, image));
        return new ResponseEntity<>("New Character created successfully.", HttpStatus.CREATED);
    }

    @DeleteMapping("/characters/{id}")
    public ResponseEntity<Object> deleteCharacter(@PathVariable Long id) {

        if (isNull(characterService.get(id))) {
            return new ResponseEntity<>(NO_HUMAN_FOUND + id + ".", HttpStatus.NOT_FOUND);
        }

        characterService.delete(id);
        return new ResponseEntity<>("Character with id " + id + " successfully removed.", HttpStatus.NO_CONTENT);
    }

    @PutMapping("/characters/{id}")
    public ResponseEntity<Object> updateCharacter(@PathVariable Long id, @RequestBody Character character) {

        if (isNull(characterService.get(id))) {
            return new ResponseEntity<>(NO_HUMAN_FOUND + id + ".", HttpStatus.NOT_FOUND);
        }

        characterService.update(id, character);
        return new ResponseEntity<>("Update performed successfully.", HttpStatus.OK);
    }

}
