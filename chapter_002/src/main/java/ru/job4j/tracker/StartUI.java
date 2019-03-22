package ru.job4j.tracker;

/**
 * Класс для работы с пользователем
 * @author Maksim Katorgin
 * @since 0.1
 * @version $Id$
 */
public class StartUI {
    /**
     * Константа для добавления заявки
     */
    private static final String ADD = "1";
    /**
     * Константа для вывода списка всех заявок
     */
    private static final String SHOW = "2";
    /**
     * Константа для редактирования заявки
     */
    private static final String EDIT = "3";
    /**
     * Константа для удаления заявки
     */
    private static final String DELETE = "4";
    /**
     * Константа для поиска заявки по ID
     */
    private static final String FBYID = "5";
    /**
     * Константа для поиска заявки по имени
     */
    private static final String FBYN = "6";
    /**
     * Константа для выхода из приложения
     */
    private static final String EXIT = "0";
    /**
     * Хранилище заявок
     */
    private final Tracker tracker;
    /**
     * Получения днных от пользователя
     */
    private final Input input;
    /**
     * Константа выхода из приложения
     */
    private boolean exit = false;

    /**
     * Конструктор Класса
     * @param input - спосов ввода данных
     * @param tracker - хранилище заявок
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основной цикс программы
     */
    public void init() {
        while (!exit) {
            this.showMenu();
            String answer  = this.input.ask("Выберите пункт меню: ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.showAll();
            } else if (EDIT.equals(answer)) {
                this.edit();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FBYID.equals(answer)) {
                this.findById();
            } else if (FBYN.equals(answer)) {
                this.findByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод для создания новой заявки
     */
    public void createItem() {
        System.out.println("Добавляю заявку........");
        String name = this.input.ask("Ввеите имя заявки: ");
        String desk = this.input.ask("Ввеите описание заявки: ");
        String time = this.input.ask("Ввеите дату создания без точек: ");
        Item item = new Item(name, desk, Long.parseLong(time));
        this.tracker.add(item);
        System.out.println("Заявка с Id " + item.getId() + " создана!");
    }

    /**
     * Метод для вывода списка всех заявок
     */
    public void showAll() {

        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].toString());
            System.out.println("__________________");
        }
    }

    /**
     * Метод для редактирования заявки
     */
    public void edit() {
        String id = this.input.ask("Введите ID заявки, для замены: ");
        String name = this.input.ask("Введите имя новой заявки: ");
        String discr = this.input.ask("Введите описание новой заявки: ");
        String time = this.input.ask("Ввеите дату создания без точек: ");
        if (tracker.replace(id, new Item(name, discr, Long.parseLong(time)))) {
            System.out.println("Заявка отредактирована!");
        } else {
            System.out.println("Заявка не отредактирована!");
        }

    }

    /**
     * Метод для удаления заявки
     */
    public void deleteItem() {
        String id = this.input.ask("Введите ID заявки для удаления: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена!");
        } else {
            System.out.println("Заявка не удалена!");
        }
    }

    /**
     * Метод поиска заявки по идентификатору
     */
    public void findById() {
        String id = input.ask("Введите ID для поиска: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("__________________");
        }
    }

    /**
     * Метод для поиска заявки по имени
     */
    public void findByName() {
        String key = this.input.ask("Введите имя для поиска: ");
        Item[] items = tracker.findByName(key);
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].toString());
            System.out.println("__________________");
        }
    }


    /**
     * Метод для вывода меню
     */
    public void showMenu() {
        System.out.println(
                "1. Add new Item\n"
                        + "2. Show all items\n"
                        + "3. Edit item\n"
                        + "4. Delete item\n"
                        + "5. Find item by Id\n"
                        + "6. Find items by name\n"
                        + "0. Exit Program");
    }

    /**
     * Запуск программы
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
