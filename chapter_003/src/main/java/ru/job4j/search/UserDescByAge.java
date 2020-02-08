package ru.job4j.search;

import java.util.Comparator;


/**
 * Task for Descending sorting by Users age
 * @author Maksim
 * @since 0.1
 * @version $Id$
 */
public class UserDescByAge implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return Integer.compare(u2.getAge(), u1.getAge());
    }
}
