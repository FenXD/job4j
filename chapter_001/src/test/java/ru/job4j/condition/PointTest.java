package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenPoint2and0ThenDistandeToPoint0and0equals2() {
        Point a = new Point(2, 0);
        Point b = new Point(0, 0);
        assertThat(2, is(a.distanceTo(b)));
    }
}
