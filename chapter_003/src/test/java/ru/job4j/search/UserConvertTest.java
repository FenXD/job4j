package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class UserConvertTest {

    @Test
    public void whenPut2UsersThenGetHashMap() {
        UserConvert converter = new UserConvert();
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Max", "Msk", 21));
        users.add(new User(2, "Ben", "Spb", 22));
        assertThat(converter.convertUser(users).get(1).getName(), is("Max"));
    }
}
