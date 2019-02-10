package ru.job4j.array;
import java.util.Arrays;

/**
 * Удаление дубликатов массива
 * @author Maksim Katorgin
 * @since 0.1
 * @version $Id$
 */
public class ArrayDuplicate {
    /**
     * Удаление дубликатов масива
     * @param array - Массив
     * @return - массив без дубликатов
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < unique; j++) {
                if (array[i].equals(array[j])) {
                    array[i] = null;
                    array[i] = array[array.length - 1];
                    unique--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
