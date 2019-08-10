package ru.job4j.tracker;

/**
 * Класс для работы с пользователем
 * @author Maksim Katorgin
 * @since 0.1
 * @version $Id$
 */
public class StartUI {
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
        TrackerMenu menu = new TrackerMenu(this.input, this.tracker);
        menu.fillActions();
        int[] range = menu.getActionRange();
        do {
            menu.show();
            menu.select(Integer.valueOf(this.input.ask("Select: ", range)));
        } while (!"y".equals(this.input.ask("Exit? (y/n): ")));
    }

    /**
     * Запуск программы
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }
}
