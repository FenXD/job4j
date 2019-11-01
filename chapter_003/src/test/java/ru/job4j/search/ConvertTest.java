package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void when2ArraysInListThen1Summed() {
        ConvertList2Array converter = new ConvertList2Array();
        List<int[]> input = new ArrayList<>();
        input.add(new int[] {1, 2});
        input.add(new int[] {3, 4, 6});
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 6);
        assertThat(converter.convert(input), is(expect));
    }
}
