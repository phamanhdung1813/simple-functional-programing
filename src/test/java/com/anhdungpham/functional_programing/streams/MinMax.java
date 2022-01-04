package com.anhdungpham.functional_programing.streams;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    @Test
    void test1() {
        List<Integer> list = List.of(1, 2, 3, 8, 4, 5, 6);
        Integer min = list.stream().max(Comparator.naturalOrder()).get();
        System.out.print(min);
    }

}
