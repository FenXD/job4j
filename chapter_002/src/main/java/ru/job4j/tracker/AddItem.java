package ru.job4j.tracker;

public class AddItem extends BaseAction {

    public AddItem(int number, String info) {
        super(number, info);
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

}
