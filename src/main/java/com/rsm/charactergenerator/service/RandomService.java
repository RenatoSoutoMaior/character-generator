package com.rsm.charactergenerator.service;

import com.rsm.charactergenerator.model.Gender;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RandomService {

    static String randomName(Gender gender) {
        List<String> names = loadFile(gender);
        Random random = new Random();

        return names.get(random.nextInt(names.size()));
    }

    private static List<String> loadFile(Gender gender) {
        List<String> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Gender.MALE.equals(gender) ?
                Paths.get("src/main/resources/static/files/male-names") :
                Paths.get("src/main/resources/static/files/female-names"))) {
            list = stream.map(String::new).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
