package com.anhdungpham.functional_programing.streams;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class IntStreamExample {
    @Test
    void IntStreamEx() {
        IntStream.rangeClosed(1, 10).forEach(i -> System.out.print(i + " "));

        System.out.println();

        IntStream.iterate(1, i -> i + 1).limit(10).forEach(i -> System.out.print(i + " "));


    }
}
