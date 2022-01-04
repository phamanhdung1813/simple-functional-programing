package com.anhdungpham.functional_programing.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter_2 {
    @Test
    void filter() {
        List<Integer> carPrice = List.of(10, 20, 30, 40, 50, 60, 70, 80);
        Predicate<Integer> condition1 = i -> i < 50;
        Predicate<Integer> condition2 = i -> i > 10;

        List<Integer> newPrice = carPrice.stream()
                .filter(condition1)
                .filter(condition2)
                .collect(Collectors.toList());

        newPrice.forEach(System.out::println);
    }

    @Test
    void dropTakeWhile() {
        Stream.of(2, 4, 6, 8, 9, 10, 12).filter(i -> i % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        Stream.of(2, 4, 6, 9, 9, 10, 12).dropWhile(i -> i % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        Stream.of(2, 4, 6, 9, 9, 10, 12).takeWhile(i -> i % 2 == 0).forEach(n -> System.out.print(n + " "));
    }

    @Test
    void find() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 6, 8, 9, 10};
        int res1 = Arrays.stream(numbers).filter(n -> n == 50).findFirst().orElse(-1);
        System.out.println(res1);

        int res2 = Arrays.stream(numbers).filter(n -> n == 6).findAny().orElse(-1);
        System.out.println(res2);

    }

    @Test
    void match() {
        int[] list1 = {2, 4, 6};
        boolean check1 = Arrays.stream(list1).allMatch(n -> n % 2 == 0);
        System.out.println(check1);

        int[] list2 = {2,4,5,6};
        boolean check2 = Arrays.stream(list2).anyMatch(n -> n % 2 == 0);
        System.out.println(check2);
    }
}
