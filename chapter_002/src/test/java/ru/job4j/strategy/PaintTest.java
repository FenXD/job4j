package ru.job4j.strategy;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {

    private final PrintStream stdout = System.out;

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void returnOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenPaintingSquare() {
        new Paint().draw(new Square());
        assertThat(this.out.toString(), is(new StringBuilder().append("+++\n")
                .append("+ +\n")
                .append("+++\n")
                .append(System.lineSeparator())
                .toString()));
    }

    @Test
    public void whenPaintingTriangle() {
        new Paint().draw(new Triangle());
        assertThat(this.out.toString(), is(new StringBuilder().append("  +  \n")
                .append(" + + \n")
                .append("+++++\n")
                .append(System.lineSeparator())
                .toString()));
    }
}
