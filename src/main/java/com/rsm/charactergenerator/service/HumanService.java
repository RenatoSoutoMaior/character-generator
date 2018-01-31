package com.rsm.charactergenerator.service;

import com.rsm.charactergenerator.model.Human;
import com.rsm.charactergenerator.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanService {

    private final HumanRepository humanRepository;

    @Autowired
    public HumanService(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

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

    public Human update(Long id, Human human) {

        Human updatedHuman = humanRepository.findOne(id);

        if (human.getName() != null) {
            updatedHuman.setName(human.getName());
        }

        if (human.getGender() != null) {
            updatedHuman.setGender(human.getGender());
        }

        humanRepository.save(updatedHuman);
        return updatedHuman;
    }
}
