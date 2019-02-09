package ru.job4j.array;

/**
 * Поиск перебором
 * @author Maksim Katorgin
 * @version 0.1
 * @since 09.02.2019
 */
public class Findloop {
    /**
     * Метод перебора массива для нахождения нужного эллемента
     * @param arr - массив
     * @param el - искомый элемент
     * @return индекс искомого элемента
     */
    public int indexOf(int[] arr, int el) {
        int rst = -1;
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
