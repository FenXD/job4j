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


    public static void main(String[] args) {
        StringCompare sc = new StringCompare();
        System.out.println(sc.compare("a", "azzzzzz"));
        System.out.println("a".compareTo("azzzzzz"));
        System.out.println(Character.compare('a', 'd'));
    }
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
        int maxLength = s1.length() > s2.length() ? s1.length() : s2.length();
        int minLength = s1.length() > s2.length() ? s2.length() : s1.length();
        while (i < maxLength) {
            if (i < minLength && i < maxLength) {
                result += Character.compare(s1.charAt(i), s2.charAt(i));
            }
            if (result != 0) {
                return result;
            }
            i++;
        }

        return s1.length() > s2.length() ? maxLength - minLength : minLength - maxLength;
    }
}
