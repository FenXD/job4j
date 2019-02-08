package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class CounterTest {
    @Test
    public void whenEvenSumFrom0To10Then30() {
        Counter count = new Counter();
        assertThat(30, is(count.add(0, 10)));
    }
}
