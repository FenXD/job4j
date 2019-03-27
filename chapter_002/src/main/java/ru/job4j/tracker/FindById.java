package ru.job4j.tracker;

public class FindById implements UserAction {
    private int number;
    private String info;
    public FindById(int number, String info) {
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
        String id = input.ask("Введите ID для поиска: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("Не найдено");
        }
        System.out.println("__________________");
    }

}
