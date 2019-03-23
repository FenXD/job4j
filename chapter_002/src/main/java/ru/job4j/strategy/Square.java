package ru.job4j.strategy;

/**
 * Класс для рисования квадрата
 * @author Maksim Katorin
 * @since 0.1
 * @cersion $Id$
 */
public class Square implements Shape {
    /**
     * Метод отрисовки квадрата в консоль
     * @return нарисованный квадрат
     */
    public String draw() {
        StringBuilder shape = new StringBuilder();
        shape.append("+++\n");
        shape.append("+ +\n");
        shape.append("+++\n");
        return shape.toString();
    }
}
