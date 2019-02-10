package ru.job4j.array;

/**
 * Двумерный массив
 * @author Maksim Katorgin
 * @since 0.1
 * @version $Id$
 */
public class Matrix {
    /**
     * Заполнение двумерного массива таблицей умножения
     * @param size - размер матрицы
     * @return таблица умножения
     */
    public int[][] multiple(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }
        return matrix;
    }

}
