package ru.job4j.tracker;

public class EditItem extends BaseAction {

    public EditItem(int number, String info) {
        super(number, info);
    }

    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Введите ID заявки, для замены: ");
        String name = input.ask("Введите имя новой заявки: ");
        String discr = input.ask("Введите описание новой заявки: ");
        String time = input.ask("Ввеите дату создания без точек: ");
        if (tracker.replace(id, new Item(name, discr, Long.parseLong(time)))) {
            System.out.println("Заявка отредактирована!");
        } else {
            System.out.println("Заявка не отредактирована!");
        }
    }
}
