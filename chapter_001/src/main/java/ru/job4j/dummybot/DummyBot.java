package ru.job4j.dummybot;

/**
 * Глупый бот
 * @author Maksim Katorgin
 * @version 0.1
 * @since 08.02.2019
 */
public class DummyBot {
    /**
     * Развговор с ботом)
     * @param question - вопрос
     * @return ответ
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
