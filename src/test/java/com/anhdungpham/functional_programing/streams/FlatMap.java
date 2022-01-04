package com.anhdungpham.functional_programing.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMap {

    public static List<List<String>> nameList = Arrays.asList(
            List.of("A", "B", "C"),
            List.of("D", "E", "F"),
            List.of("G", "H", "I")
    );

    @BeforeEach
    void print() {
        System.out.println(nameList);
        System.out.println();
    }

    @Test
    void noFlat() {
        List<String> list = new ArrayList<>();
        for (List<String> i : nameList) {
            list.addAll(i);
        }
        System.out.println("NO FLAT " + list);
    }

    @Test
    void flatStream() {
        List<String> list = nameList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("STREAM FLAT " + list);
    }

    @Test
    void flatOptional() {
        List<Optional<String>> nameList = Arrays.asList(
                Optional.of("ANH"),
                Optional.of("DUNG")
        );

        List<String> list = nameList.stream().flatMap(Optional::stream).collect(Collectors.toList());
        System.out.println("OPTIONAL FLAT" + list);
    }
}
