package ru.job4j.tracker;

public class FindByName extends BaseAction {

    public FindByName(int number, String info) {
        super(number, info);
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
