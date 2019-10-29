package ru.job4j.search;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertArray2ListTest {

    @Test
    public void when2on2ArrayhenList4() {
        ConvertArray2List converter = new ConvertArray2List();
        int[][] input = new int[][] {{2, 6}, {4, 1}};
        List<Integer> expect = Arrays.asList(2, 6, 4, 1);
        List<Integer> result = converter.convertArr2List(input);
        assertThat(result, is(expect));
    }
}
