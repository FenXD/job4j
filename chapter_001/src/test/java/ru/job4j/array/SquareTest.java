package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square calc = new Square();
        int[] rsl = calc.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenBound2Then14() {
        int bound = 2;
        Square calc = new Square();
        int[] rsl = calc.calculate(bound);
        int[] expect = new int[] {1, 4};
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenBound4Then14916() {
        int bound = 4;
        Square calc = new Square();
        int[] rsl = calc.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16};
        assertThat(rsl, is(expect));
    }
}
