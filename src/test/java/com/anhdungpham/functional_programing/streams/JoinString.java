package com.anhdungpham.functional_programing.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
    @Test
    void test1() {
        List<String> names = List.of("anh", "dung", "pham");
//        Anh Dung Pham
        StringBuilder join = new StringBuilder();
        for (String i : names) {
            join.append(i.substring(0, 1).toUpperCase())
                    .append(i.substring(1))
                    .append(" ");
        }
        System.out.print(join);
    }

    @Test
    void test2() {
        List<String> names = List.of("anh", "stanley", "pham");
        String join = names.stream().map(i -> i.substring(0, 1).toUpperCase() + i.substring(1))
                .collect(Collectors.joining(" "));
        System.out.print(join);
    }

}
