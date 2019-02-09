package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тестирование проверки однородности массива
 * @author Maksim Katorgin
 * @version 0.1
 * @since 09.02.2019
 */
public class CheckTest {
    @Test
    public void whenFalseFalseFalseThenTrue() {
        Check check = new Check();
        boolean[] bool = new boolean[] {false, false, false};
        assertThat(check.mono(bool), is(true));
    }
    @Test
    public void whenTrueFalseTrueThenFalse() {
        Check checker = new Check();
        boolean[] bool = new boolean[] {true, false, true};
        assertThat(checker.mono(bool), is(false));
    }


}
