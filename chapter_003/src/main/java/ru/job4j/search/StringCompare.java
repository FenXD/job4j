package ru.job4j.search;

import java.sql.SQLOutput;
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
     * @return {1} - if first one greater then second,
     *         {-1} - if second one greater then first,
     *         {0} - if strings are equal
     */
    @Override
    public int compare(String s1, String s2) {
        int result;
        int i = 0;
        int minLength = s1.length() > s2.length() ? s2.length() : s1.length();
        while (i < minLength) {
            result = Integer.compare(s1.charAt(i), s2.charAt(i));
            i++;
            if (result != 0) {
                return result;
            }
        }
        if (i == s1.length() && i == s2.length()) {
            return 0;
        }
        return minLength == s1.length() ? -1 : 1;
    }
}
