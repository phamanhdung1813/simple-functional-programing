package com.anhdungpham.functional_programing.dto;

public class PersonDTO {
    private final String name;
    private final Integer age;

    public PersonDTO(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [" + "name = " + name + ", age = " + age + "]";
    }

    public static PersonDTO mappingData(Person person) {
        return new PersonDTO(person.getFirstName() + " " + person.getLastName(), person.getAge());
    }
}
