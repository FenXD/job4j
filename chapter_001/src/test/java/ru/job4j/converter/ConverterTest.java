package ru.job4j.converter;

import org.junit.Test;

import java.lang.annotation.Target;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void when1EuroToRubleThen70() {
        Converter con = new Converter();
        int result = con.euroToRuble(1);
        int expected = 70;
        assertThat(result, is(expected));
    }

    @Test
    public void when1DollarToRubleThen60() {
        Converter con = new Converter();
        int result = con.dollarToRuble(1);
        int expected = 60;
        assertThat(result, is(expected));
    }
}
