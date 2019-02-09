package ru.job4j.array;

/**
 * Массив степеней
 */
public class Square {
    /**
     * Заполнение массива степенями чисел
     * @param bound - размер массива
     * @return - массив квадратов
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int j = 1;
        for (int i = 0; i != rst.length; i++) {
            rst[i] = j * j;
            j++;
        }
        return rst;
    }
}
