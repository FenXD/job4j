package ru.job4j.search;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Convertion list to array test
 * @author Maksim
 * @version $Id$
 * @since 0.1
 */
public class ConvertTest {
    @Test
    public void onCreatingArray() {
        ConvertList2Array converter = new ConvertList2Array();
        int rows;
        int cells;
        int[][] result = converter.toArray(
                Arrays.asList(1, 2, 3, 4, 1, 6, 7, 8, 9, 7), 4);
        int[][] expect = {
                {1, 2, 3},
                {4, 1, 6},
                {7, 8, 9},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }
}
