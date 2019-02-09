package ru.job4j.array;

/**
 * Разворот массива
 * @author Maksim Katorgin
 * @version 0.1
 * @since 09.02.2019
 */
public class Turn {
    /**
     * Разворот массива
     * @param array - массив
     * @return развернутый массив
     */
    public int[] back(int[] array) {
        int temp = 0;
        for (int i = 0; i <= array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
