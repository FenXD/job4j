package ru.job4j.tracker;

/**
 * Интерфейс для получения данных от пользователя
 * @author Maksim Katogin
 * @since 0.1
 * @version $Id$
 */
public interface Input {

    String ask(String question);

}
