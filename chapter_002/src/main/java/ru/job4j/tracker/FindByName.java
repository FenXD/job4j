package ru.job4j.tracker;

import java.util.List;

public class FindByName extends BaseAction {

    public FindByName(int number, String info) {
        super(number, info);
    }

    public void execute(Input input, Tracker tracker) {
        String key = input.ask("Введите имя для поиска: ");
        List<Item> items = tracker.findByName(key);
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).toString());
            System.out.println("__________________");
        }
    }

}
