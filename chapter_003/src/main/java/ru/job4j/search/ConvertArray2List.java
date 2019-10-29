package ru.job4j.search;


import java.util.ArrayList;
import java.util.List;

/**
 * Class for converting list to double-dim array
 * @author Katorgin Maxim
 * @since 0.1
 * @version $Id$
 */
public class ConvertArray2List {

    public List<Integer> convertArr2List(int[][] arr) {
        List<Integer> result = new ArrayList<Integer>();
        for (int[] row : arr) {
            for (int cell : row) {
                result.add(cell);
            }
        }
        return result;
    }
}
