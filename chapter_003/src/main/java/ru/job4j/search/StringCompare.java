package ru.job4j.search;

import java.util.Comparator;

/**
 * String comparing class
 * @author Maxim
 * @since 0.1
 * @version $Id$
 */
public class StringCompare implements Comparator<String> {



    /**
     * Method for comparing tho strings bu chars
     * @param s1 - first string
     * @param s2 - second string
     * @return greater than {0} - if first one greater then second,
     *         less than {0} - if second one greater then first,
     *         {0} - if strings are equal
     */
    @Override
    public int compare(String s1, String s2) {
        int result = 0;
        int i = 0;
        int minLength = Math.min(s1.length(), s2.length());
        while (i < minLength) {
                result = Character.compare(s1.charAt(i), s2.charAt(i));
            if (result != 0) {
                return result;
            }
            i++;
        }
        return Integer.compare(s1.length(), s2.length());
    }
}
