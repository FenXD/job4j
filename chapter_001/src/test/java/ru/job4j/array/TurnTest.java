package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тестирование разворота массива
 */
public class TurnTest {
    @Test
    public void when12345Then54321() {
        Turn turn = new Turn();
        int[] array = new int[] {1, 2, 3, 4, 5};
        assertThat(turn.back(array), is(array));
    }
}
