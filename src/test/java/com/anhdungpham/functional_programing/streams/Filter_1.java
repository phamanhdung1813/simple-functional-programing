package com.anhdungpham.functional_programing.streams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_1 {
    @Test
    public void basic() {
        List<Integer> age = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> newAge = new ArrayList<>();
        int limit = 5;
        int count = 0;
        for (Integer i : age) {
            if (i <= 9) {
                newAge.add(i);
                count++;
                if (count == limit) {
                    break;
                }
            }
        }
        newAge.forEach(System.out::println);
    }

    @Test
    void stream() {
        List<Integer> age = List.of(1,2,3,4,5,6,7,8,10);
        List<Integer> newAge =  age.stream().filter(i -> i<=9).limit(5).collect(Collectors.toList());
        newAge.forEach(System.out::println);
    }
}


