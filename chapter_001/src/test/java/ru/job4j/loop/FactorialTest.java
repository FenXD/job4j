package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenThirty() {
        Factorial fac = new Factorial();
        assertThat(120, is(fac.calc(5)));
    }
    @Test
    public void whenCalculateFactorialOfZeroThenOne() {
        Factorial fac = new Factorial();
        assertThat(1, is(fac.calc(0)));
    }
}

