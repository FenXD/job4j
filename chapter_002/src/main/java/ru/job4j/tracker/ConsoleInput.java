package ru.job4j.tracker;
/**
 * Класс для получения данных от пользователя
 * @author Maksim Katorgin
 * @since 0.1
 * @version $Id$
 */

import java.util.Scanner;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Метод запроса данных от пользователя
     * @param question вопрос пользователю для вывода на экран
     * @return ответ пользователя
     */
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public int ask(String question, int[] range) {
        boolean exists = false;
        int key = Integer.valueOf(this.ask(question));
        for (int value : range) {
            if (key == value) {
                exists = true;
            }
        }
        if (!exists) {
            throw new MenuOutExceprion("Out of bounds");
        }
        return key;
    }

}
