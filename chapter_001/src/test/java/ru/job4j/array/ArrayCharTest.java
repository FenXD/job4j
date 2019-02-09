package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Тестирование проверки совпадения префикса
 * @author Maksim Katorgin
 * @verion 0.1
 * @since 09.02.2019
 */
public class ArrayCharTest {
    @Test
    public void whenPrefixHeAndWordHelloThenTrue() {
        ArrayChar array = new ArrayChar("Hello");
        assertThat(array.startWith("He"), is(true));
    }
    @Test
    public void whenPrefixHiAndWorldHelloThenFalse() {
        ArrayChar array = new ArrayChar("Hello");
        assertThat(array.startWith("Hi"), is(false));
    }

}
