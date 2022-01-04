package com.anhdungpham.functional_programing.streams;

import com.anhdungpham.functional_programing.dto.Person;
import org.junit.jupiter.api.Test;

import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Statistic {
    @Test
    void test1() {
        List<Person> person = List.of(
                new Person("Anh", "Dung", 10),
                new Person("Pham", "Pham", 20),
                new Person("Dung", "Pham", 30),
                new Person("Dung", "Pham", 30)
        );

        long count = person.stream()
                .filter(i -> i.getLastName().equalsIgnoreCase("Pham"))
                .filter(j -> j.getAge() > 15)
                .count();
        System.out.println(count);

        //min max average sum
        double min = person.stream().mapToDouble(Person::getAge).average().orElse(-1);
        System.out.println(min);

        // Statistic
        DoubleSummaryStatistics statistic = person.stream().mapToDouble(Person::getAge)
                .filter(i -> i > 10)
                .summaryStatistics();
        System.out.println(statistic.getCount());

    }
}
