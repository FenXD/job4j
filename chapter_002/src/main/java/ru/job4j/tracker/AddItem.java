package ru.job4j.tracker;

public class AddItem  implements UserAction {

    private int number;
    private String info;
    public AddItem(int number, String info) {
        this.number = number;
        this.info = info;
    }
    public int key() {
        return number;
    }

    public void execute(Input input, Tracker tracker) {
        System.out.println("Добавляю заявку........");
        String name = input.ask("Ввеите имя заявки: ");
        String desk = input.ask("Ввеите описание заявки: ");
        String time = input.ask("Ввеите дату создания без точек: ");
        Item item = new Item(name, desk, Long.parseLong(time));
        tracker.add(item);
        System.out.println("Заявка с Id " + item.getId() + " создана!");
    }

    public String info() {
        return info;
    }
}
