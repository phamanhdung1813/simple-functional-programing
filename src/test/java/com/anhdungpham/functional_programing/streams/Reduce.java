package com.anhdungpham.functional_programing.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Reduce {
    @Test
    void reduce() {
        int[] numbers = {1, 2, 3, 4, 100}; //110 //-110
        int sum =  Arrays.stream(numbers).reduce(0, Integer::sum);
        System.out.println(sum);

        int subtract =  Arrays.stream(numbers).reduce(0, (a,b) -> a-b);
        System.out.println(subtract);
    }

    @Test
    void name() {
        int[] numbers = {1, 2, 3, 4, 100}; //110 //-110
        int sum = Arrays.stream(numbers).reduce(0, (a,b) -> a-b);
    }
}
