package ru.job4j.array;

/**
 * Реализация метода startWith
 * @author Maksim Katorgin
 * @version 0.1
 * @since 09.02.2019
 */
public class ArrayChar {
    private char[] data;

    /**
     * Конструктор
     * @param line строка,которая разбиравется на символы
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * проверка совпадения префиксов
     * @param prefix - нужный префикс
     * @return - результат проверки
     */
    public boolean startWith(String prefix) {
        char[] value = prefix.toCharArray();
        boolean result = true;
        for (int i = 0; i < value.length; i++) {
            if (value[i] != data[i]) {
                result = false;
            }
        }
        return result;
    }
}
