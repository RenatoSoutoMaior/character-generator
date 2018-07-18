package com.rsm.charactergenerator.resource;

import com.rsm.charactergenerator.model.Gender;
import com.rsm.charactergenerator.model.Human;
import com.rsm.charactergenerator.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Objects.isNull;

@RestController
public class HumanResource {

    private static final String NO_HUMAN_FOUND = "No Human found with ID ";

    @Autowired
    private HumanService humanService;

    @GetMapping("/humans")
    public ResponseEntity<Object> getHumans() {

        List<Human> humans = humanService.getAll();

        if (humans.isEmpty()) {
            return new ResponseEntity<>("No Humans found.", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(humans, HttpStatus.OK);
    }

    @GetMapping("/humans/{id}")
    public ResponseEntity<Object> getHuman(@PathVariable("id") Long id) {

        Human human = humanService.get(id);

        if (isNull(human)) {
            return new ResponseEntity<>(NO_HUMAN_FOUND + id + ".", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(human, HttpStatus.OK);
    }

    @PostMapping(value = "/humans", consumes = "application/json")
    public ResponseEntity<Object> createHuman(@RequestParam String name, Gender gender, String image) {

        if (isNull(name) || isNull(gender)) {
            return new ResponseEntity<>("Error trying to create a new Human. Please check data included.", HttpStatus.BAD_REQUEST);
        }

        humanService.create(new Human(name, gender, image));
        return new ResponseEntity<>("New Human created successfully.", HttpStatus.CREATED);
    }

    @DeleteMapping("/humans/{id}")
    public ResponseEntity<Object> deleteHuman(@PathVariable Long id) {

        if (isNull(humanService.get(id))) {
            return new ResponseEntity<>(NO_HUMAN_FOUND + id + ".", HttpStatus.NOT_FOUND);
        }

        humanService.delete(id);
        return new ResponseEntity<>("Human with id " + id + " successfully removed.", HttpStatus.NO_CONTENT);
    }

    @PutMapping("/humans/{id}")
    public ResponseEntity<Object> updateHuman(@PathVariable Long id, @RequestBody Human human) {

        if (isNull(humanService.get(id))) {
            return new ResponseEntity<>(NO_HUMAN_FOUND + id + ".", HttpStatus.NOT_FOUND);
        }

        humanService.update(id, human);
        return new ResponseEntity<>("Update performed successfully.", HttpStatus.OK);
    }

}
