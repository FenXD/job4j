package ru.job4j.tracker;

import java.util.List;

public class ShowAll extends BaseAction {

    public ShowAll(int number, String info) {
        super(number, info);
    }
    public void execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) != null) {
                System.out.println(items.get(i).toString());
                System.out.println("__________________");
            }
        }
    }
}
