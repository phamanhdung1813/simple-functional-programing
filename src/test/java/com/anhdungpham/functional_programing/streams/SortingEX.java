package com.anhdungpham.functional_programing.streams;

import com.anhdungpham.functional_programing.dto.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingEX {
    @Test
    void listSorting() {
        List<String> cities = Arrays.asList(
                "Milan",
                "London",
                "San Francisco",
                "Tokyo",
                "New Delhi"
        );

        cities.sort(Comparator.reverseOrder());
        cities.sort(Comparator.naturalOrder());
        System.out.print(cities);

    }

    @Test
    void streamSorting() {
        List<Person> people = List.of(
                new Person("Anh", "Dung", 10),
                new Person("Pham", "Stanley", 20),
                new Person("Dung", "Pham", 30)
        );

        List<String> sorted = people.stream()
                .map(Person::getLastName )
                .map(i -> i.substring(1,2).toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.print(sorted);
    }

    @Test
    void comparator() {
        List<Person> people = Arrays.asList(
                new Person("Anh", "Dung", 10),
                new Person("Pham", "Stanley", 20),
                new Person("Dung", "Pham", 30)
        );
        Comparator<Person> compare =  Comparator
                .comparing(Person::getFirstName)
                .reversed()
                .thenComparing(Person::getLastName);

        List<Person> sort = people.stream().sorted(compare).collect(Collectors.toList());

        sort.forEach(System.out::println);
    }

}
