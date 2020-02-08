package ru.job4j.search;

import java.util.Comparator;

/**
 * Task for Ascending sorting by Users age
 * @author Maksim
 * @since 0.1
 * @version $Id$
 */
public class UserAscByAge implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return Integer.compare(u1.getAge(), u2.getAge());
    }
}
