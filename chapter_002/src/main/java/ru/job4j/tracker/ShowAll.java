package ru.job4j.tracker;

public class ShowAll implements UserAction {

    private int number;
    private String info;

    public ShowAll(int number, String info) {
        this.number = number;
        this.info = info;
    }

    public int key() {
        return number;
    }

    public String info() {
        return info;
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
