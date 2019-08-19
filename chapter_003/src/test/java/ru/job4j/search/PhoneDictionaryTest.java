package ru.job4j.search;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {

    @Test
    public void whenSearcingPersonThenFindCorrectly() {
        PhoneDictionary phoneD = new PhoneDictionary();
        phoneD.add(new Person("Ivan", "Fedorov", "772354", "Moscow"));
        List<Person> persons = phoneD.findPerson("235");
        assertThat(persons.iterator().next().getName(), is("Ivan"));
    }
}
