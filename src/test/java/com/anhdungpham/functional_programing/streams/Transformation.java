package com.anhdungpham.functional_programing.streams;

import com.anhdungpham.functional_programing.dto.Person;
import com.anhdungpham.functional_programing.dto.PersonDTO;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Transformation {
    @Test
    void test1() {
        List<Person> people = List.of(
                new Person("Anh", "Dung", 10),
                new Person("Pham", "Stanley", 20),
                new Person("Dung", "Pham", 30)
        );

        Function<Person, PersonDTO> data = person -> new PersonDTO(
                person.getFirstName() + person.getLastName(),
                person.getAge()
        );
        
        List<PersonDTO> result = people.stream()
                .filter(i -> i.getAge() > 15)
                .map(PersonDTO::mappingData).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
