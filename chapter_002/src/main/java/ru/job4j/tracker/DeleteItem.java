package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    private int number;
    private String info;

    public DeleteItem(int number, String info) {
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
            String id = input.ask("Введите ID заявки для удаления: ");
            if (tracker.delete(id)) {
                System.out.println("Заявка удалена!");
            } else {
                System.out.println("Заявка не удалена!");
        }
    }
}
