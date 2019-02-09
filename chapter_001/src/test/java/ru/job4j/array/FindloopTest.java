package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Тестирование перебора массива
 * @author Maksim katorgin
 * @version 0.1
 * @since 09.02.2019
 */
public class FindloopTest {
    @Test
    public void when132And2Then1() {
        int[] array = new int[] {1, 2, 3};
        Findloop find = new Findloop();
        int el = 2;
        assertThat(find.indexOf(array, el), is(1));
    }
    @Test
    public void when123And4thenNoFound() {
        int[] array = new int[] {1, 2, 3};
        Findloop find = new Findloop();
        assertThat(find.indexOf(array, 4), is(-1));
    }

}
