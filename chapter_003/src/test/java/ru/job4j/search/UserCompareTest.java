package ru.job4j.search;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

/**
 * Тестирование сортировани User`ов
 * @author Maksim
 * @since 0.1
 * @version $Id$
 */


public class UserCompareTest {

    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User(1, "Petr", "Msk", 31));
        users.add(new User(2, "Ivan", "Msk", 32));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User(2, "Ivan", "Msk", 32)));
        assertThat(it.next(), is(new User(1, "Petr", "Msk", 31)));
    }

    @Test
    public void whenPertVsIvan() {
        int result;
        result = new User(1, "Petr", "Msk", 31).compareTo(new User(2, "Ivan", "Msk", 32));
        assertThat(result, greaterThan(0));
    }

}
