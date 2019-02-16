package ru.job4j.array;

/**
 * Сортировка пузырьком
 * @author Maksim Katorgin
 * @version 0.1
 * @since 10.02.2019
 */
public class BubbleSort {
    /**
     * Сортировка массива пузырьком
     * @param array - массив
     * @return - отсортированный массив
     */
    public int[] sort(int[] array) {
        int temp;
        int made = 0;
        for (int index = 0; index != array.length - made + 1; index++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    made++;
                }
            }
        }
        return array;
    }
}
