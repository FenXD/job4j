package ru.job4j.condition;

/**
 * Класс точка
 * @author Maksim
 * @version 0.1
 * @since 06.02.2019
 */
public class Point {
    private int x;
    private int y;

    /**
     * Передача координат точки в её поля
     * @param x - по X
     * @param y - по Y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Расстояние между точкими
     * @param that - точка ДО которой считаем
     * @return расстояние
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }
}
