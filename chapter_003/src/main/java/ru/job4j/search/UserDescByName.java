package ru.job4j.search;

import java.util.Comparator;


/**
 * Task for Descending sorting by Users name
 * @author Maksim
 * @since 0.1
 * @version $Id$
 */
public class UserDescByName implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return u2.getName().compareTo(u1.getName());
    }
}
