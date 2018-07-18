package com.rsm.charactergenerator.service;

import com.rsm.charactergenerator.model.Human;
import com.rsm.charactergenerator.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.nonNull;

@Service
public class HumanService {

    @Autowired
    private HumanRepository humanRepository;

    public List<Human> getAll() {
        return humanRepository.findAll();
    }

    public Human get(Long id) {
        return humanRepository.findOne(id);
    }

    public void create(Human human) {
        humanRepository.save(human);
    }

    public void delete(Long id) {
        humanRepository.delete(id);
    }

    public void update(Long id, Human human) {
        Human updatedHuman = humanRepository.findOne(id);

        if (nonNull(human.getName())) {
            updatedHuman.setName(human.getName());
        }

        if (nonNull(human.getGender())) {
            updatedHuman.setGender(human.getGender());
        }

        if (nonNull(human.getImage())) {
            updatedHuman.setImage(human.getImage());
        }

        humanRepository.save(updatedHuman);
    }
}
