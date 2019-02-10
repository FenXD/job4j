package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тест тортировки массива
 * @author Maksim Katorgin
 * @version 0.1
 * @since 10.02.2019
 */
public class BubbleSortTest {
    @Test
    public void when1782394650Then0123456789() {
        BubbleSort sort = new BubbleSort();
        int[] array = new int[] {1, 7, 8, 2, 3, 9, 4, 6, 5, 0};
        int[] result = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(sort.sort(array), is(result));

    }
}
