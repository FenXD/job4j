package ru.job4j.search;

import java.util.HashMap;
import java.util.List;

public class UserConvert {
    public HashMap<Integer, User> convertUser(List<User> userList) {
        HashMap<Integer, User> result = new HashMap<>();
        for (User user: userList) {
            result.put(user.getId(), user);
        }
        return result;
    }
}
