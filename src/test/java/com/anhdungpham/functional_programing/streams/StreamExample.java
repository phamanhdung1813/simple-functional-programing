package com.anhdungpham.functional_programing.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    @Test
    void streamTest() {
        Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream<Integer> stream = Arrays.stream(list);

        List<Integer> myResult = stream.filter(i -> {
                    return i > 5;
                })
                .map(j -> {
                    return j * 10;
                })
                .collect(Collectors.toList());

        System.out.println(myResult);

    }
}
