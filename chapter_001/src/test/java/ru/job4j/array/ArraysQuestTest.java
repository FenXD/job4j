package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArraysQuestTest {
    @Test
    public void when01And23Then0123() {
        ArraysQuest array = new ArraysQuest();
        int[] first = new int[] {0, 1, 4, 5, 7};
        int[] second = new int[] {2, 3, 6};
        int[] result = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        assertThat(array.thirdArray(first, second), is(result));
    }
}