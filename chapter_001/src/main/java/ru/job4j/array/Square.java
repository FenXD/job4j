package ru.job4j.array;

/**
 * Массив степеней
 * @author Maksim Katorgin
 * @version 0.2
 * @since 09.02.2019
 */
public class Square {
    /**
     * Заполнение массива степенями чисел
     * @param bound - размер массива
     * @return - массив квадратов
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i != rst.length; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}
