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
        for (Integer num : list) {
            array[index / 3][index++ % 3] = num;
        }
        return array;
    }
}
