package ru.job4j.tracker;

public class FindByName implements UserAction {

    private int number;
    private String info;
    public FindByName(int number, String info) {
        this.number = number;
        this.info = info;
    }

    public int key() {
        return this.number;
    }

    public String info() {
        return this.info;
    }

    public void execute(Input input, Tracker tracker) {
        String key = input.ask("Введите имя для поиска: ");
        Item[] items = tracker.findByName(key);
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].toString());
            System.out.println("__________________");
        }
    }

}
