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
        int euro = value / 70;
        return euro;
    }

    /**
     * Перевод рублей в доллары
     * @param value - рубли
     * @return доллары
     */
    public int rubleToDollar(int value) {
        int dollar = value / 60;
        return dollar;
    }

    /**
     * Перевод долларов в рубли
     * @param value - доллары
     * @return рубли
     */
    public int dollarToRuble(int value) {
        int ruble = value * 60;
        return ruble;
    }

    /**
     * Перевод евро в рубли
     * @param value - евро
     * @return рубли
     */
    public int euroToRuble(int value) {
        int ruble = value * 70;
        return ruble;
    }
}
