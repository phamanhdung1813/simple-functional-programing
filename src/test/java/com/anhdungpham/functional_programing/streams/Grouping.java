package com.anhdungpham.functional_programing.streams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Grouping {
    @Test
    void simple() {
        List<String> names = List.of(
                "John",
                "John",
                "Mariam",
                "Alex",
                "Mohammado",
                "Mohammado",
                "Vincent",
                "Alex",
                "Alex"
        );
        // [john=2, mriam=1, alex=1, mohammdo=2, alex=2]
        Map<String, Long> streamList = names.stream().collect(Collectors.groupingBy(
            Function.identity(),
            Collectors.counting()
        ));
        System.out.println(streamList);

        // convert map into list
        List<Map.Entry<String, Long>> finalResult = new ArrayList<>(streamList.entrySet());
        System.out.println(finalResult);
    }
}
