package ru.job4j.array;

/**
 * Однородный массив
 * @author Maksim Katorgin
 * @version 0.1
 * @since 09.02.2019
 */
public class Check {
    /**
     * Проверка однородности массива
     * @param data - массив
     * @return результат проверки
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i != data.length; i++) {
            if (data[i] != data[1]) {
                result = false;
            }
        }
        return result;
    }
}
