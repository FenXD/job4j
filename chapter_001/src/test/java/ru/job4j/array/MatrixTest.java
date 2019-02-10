package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тест создания таблицы умножения
 * @author Maksim Katorgin
 * @since 0.1
 * @version $Id$
 */
public class MatrixTest {
    @Test
    public void whenSize2Then12And24() {
        Matrix mat = new Matrix();
        int[][] result = new int[][] {{1, 2}, {2, 4}};
        assertThat(mat.multiple(2), is(result));
    }
}
