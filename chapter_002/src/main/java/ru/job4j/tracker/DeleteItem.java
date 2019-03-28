package ru.job4j.tracker;

public class DeleteItem extends BaseAction {

    public DeleteItem(int number, String info) {
        super(number, info);
    }

    public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите ID заявки для удаления: ");
            if (tracker.delete(id)) {
                System.out.println("Заявка удалена!");
            } else {
                System.out.println("Заявка не удалена!");
        }
    }
}
