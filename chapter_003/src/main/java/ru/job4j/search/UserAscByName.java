package ru.job4j.search;


import java.util.Comparator;


/**
 * Task for Ascending sorting by Users name
 * @author Maksim
 * @since 0.1
 * @version $Id$
 */
public class UserAscByName implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        return u1.getName().compareTo(u2.getName());
    }
}
