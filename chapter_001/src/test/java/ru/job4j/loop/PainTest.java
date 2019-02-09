package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Тестирование Пирамиды
 * @author Maksim Katorgin
 * @version 0.1
 * @sicne 09.02.2019
 */
public class PainTest {
    @Test
    public void whenPyramidHeightIsTwo() {
        Paint pir = new Paint();
        String ln = System.lineSeparator();
        assertThat(String.format(" ^ %s^^^%s", ln, ln), is(pir.pyramid(2)));

    }
    @Test
    public void whenPyramidHeightIsThree() {
        Paint pir = new Paint();
        String ln = System.lineSeparator();
        assertThat(String.format("  ^  %s ^^^ %s^^^^^%s", ln, ln, ln), is(pir.pyramid(3)));

    }
}