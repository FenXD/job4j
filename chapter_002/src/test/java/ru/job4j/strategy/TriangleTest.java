package ru.job4j.strategy;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleTest {
    @Test
    public void whenDrawTraingle() {
        Triangle square = new Triangle();
        assertThat(square.draw(), is(new StringBuilder().append("  +  \n")
                                                        .append(" + + \n")
                                                        .append("+++++\n")
                                                        .toString()));
    }
}
