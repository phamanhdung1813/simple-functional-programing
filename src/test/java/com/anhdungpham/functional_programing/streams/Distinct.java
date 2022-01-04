package com.anhdungpham.functional_programing.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    @Test
    public void distinct() throws Exception {
        List<Integer> numbers = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
//        Set<Integer> distinct = numbers.stream().collect(Collectors.toSet());
        List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct.getClass().getName());
    }
}
