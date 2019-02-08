package ru.job4j.loop;

/**
 *  Подсчет суммы четных чисел
 * @author Maksim Katorgin
 * @version 0.1
 * @since 08.02.2019
 */
public class Counter {
    /**
     * Метод для подсчета суммы
     * @param start начальное число
     * @param finish - конечное число
     * @return сумма четных чисел
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                 sum += i;
            }
        }
        return sum;
    }
}
