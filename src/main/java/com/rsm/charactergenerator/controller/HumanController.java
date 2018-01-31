package com.rsm.charactergenerator.controller;

import com.rsm.charactergenerator.model.Human;
import com.rsm.charactergenerator.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HumanController {

    private static final String NENHUM_HUMANO_ENCONTRADO = "Nenhum Humano encontrado com o ID";
    private final HumanService humanService;

    @Autowired
    public HumanController(HumanService humanService) {
        this.humanService = humanService;
    }


    @GetMapping("/humans")
    public List<Human> getHumans() {
        return humanService.getAll();
    }

    @GetMapping("/human/{id}")
    public ResponseEntity<Object> getHuman(@PathVariable("id") Long id) {

        Human human = humanService.get(id);
        if (human == null) {
            return new ResponseEntity<>(NENHUM_HUMANO_ENCONTRADO + " " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(human, HttpStatus.OK);
    }

    @PostMapping(value = "/human", consumes = "application/json")
    public ResponseEntity<Human> createHuman(@RequestBody Human human) {

        humanService.create(human);

        return new ResponseEntity<>(human, HttpStatus.OK);
    }

    @DeleteMapping("/human/{id}")
    public ResponseEntity<java.io.Serializable> deleteHuman(@PathVariable Long id) {

        humanService.delete(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PutMapping("/human/{id}")
    public ResponseEntity<Object> updateHuman(@PathVariable Long id, @RequestBody Human human) {

        human = humanService.update(id, human);

        if (null == human) {
            return new ResponseEntity<>(NENHUM_HUMANO_ENCONTRADO + " " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(human, HttpStatus.OK);
    }

}
