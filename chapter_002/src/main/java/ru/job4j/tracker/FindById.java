package ru.job4j.tracker;

public class FindById extends BaseAction {

    public FindById(int number, String info) {
        super(number, info);
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
