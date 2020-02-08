package ru.job4j.search;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class UserComparatorsTest {
    User u1 = new User(1, "Max", "Msk", 15);
    User u2 = new User(2, "Ben", "Nyc", 20);
    @Test
    public void whenAscCompByAge() {
        Comparator<User> comp = new UserAscByAge();
        int result = comp.compare(this.u1, this.u2);
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenDescCompByAge() {
        Comparator<User> comp = new UserDescByAge();
        int result = comp.compare(this.u2, this.u1);
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenAscCompByName() {
        Comparator<User> comp = new UserAscByName();
        int result = comp.compare(this.u2, this.u1);
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenDescCompByName() {
        Comparator<User> comp = new UserDescByName();
        int result = comp.compare(this.u1, this.u2);
        assertThat(result, lessThan(0));
    }

    @Test
    public void wherDescCompByNameAndAge() {
        Comparator<User> comp = new UserDescByName().thenComparing(new UserDescByAge());
        int result = comp.compare(u1, u2);
        assertThat(result, lessThan(0));
    }

    @Test
    public void wherDescCompByNameAndAgeWithSameName() {
        u1 = new User(1, "Ben", "Msk", 15);
        u2 = new User(2, "Ben", "Nyc", 20);
        Comparator<User> comp = new UserDescByName().thenComparing(new UserDescByAge());
        int result = comp.compare(u2, u1);
        assertThat(result, lessThan(0));
    }

}
