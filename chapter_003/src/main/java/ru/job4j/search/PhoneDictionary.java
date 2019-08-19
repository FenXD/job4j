package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс с телефонным кправочником
 * @author Maksim
 * @since 0.1
 * @version $Id$
 */
public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    /**
     * Person add to list
     * @param person - person needs to be added
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    public List<Person> findPerson(String key) {
        List<Person> result = new ArrayList<>();
        for (Person person: persons) {
            if (person.getAdress().contains(key) || person.getName().contains(key) || person.getPhone().contains(key) || person.getSurname().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }

}
