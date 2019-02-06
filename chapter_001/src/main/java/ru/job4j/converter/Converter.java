package ru.job4j.converter;

/**
 * Конвертер валюты
 */
public class Converter {
    /**
     * Перевод рублей в евро
     * @param value - рубли
     * @return евро
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Перевод рублей в доллары
     * @param value - рубли
     * @return доллары
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Перевод долларов в рубли
     * @param value - доллары
     * @return рубли
     */
    public int dollarToRuble(int value) {
        return value * 60;
    }

    /**
     * Перевод евро в рубли
     * @param value - евро
     * @return рубли
     */
    public int euroToRuble(int value) {
        return value * 70;
    }
}
