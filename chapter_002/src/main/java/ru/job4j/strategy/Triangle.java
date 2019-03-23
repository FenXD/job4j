package ru.job4j.strategy;

/**
 * Класс для отрисовки треугольника
 * @author Maksim Katorgin
 * @since 0.1
 * @version $Id$
 */
public class Triangle implements Shape {
    /**
     * Рисование треугольника
     * @return рисунок треугольника
     */
    public String draw() {
        StringBuilder shape = new StringBuilder();
        shape.append("  +  \n");
        shape.append(" + + \n");
        shape.append("+++++\n");
        return shape.toString();
    }
}
