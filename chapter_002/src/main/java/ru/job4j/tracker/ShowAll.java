package ru.job4j.tracker;

public class ShowAll extends BaseAction {

    public ShowAll(int number, String info) {
        super(number, info);
    }
    public void execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(items[i].toString());
                System.out.println("__________________");
            }
        }
    }
}
