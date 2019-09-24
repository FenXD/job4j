package ru.job4j.search;

import java.util.List;

/**
 * Class for converting list into 2-dim array
 * @author Maksim
 * @since 0.1
 * @version $Id$
 */
public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (list.size() % rows == 0) ? list.size() / rows : list.size() / rows + 1;
        int index = 0;
        int[][] array = new int[rows][cells];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                if (index < list.size()) {
                    array[i][j] = list.listIterator(index++).next();
                }
            }
        }

        return array;
    }
}
