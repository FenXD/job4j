package ru.job4j.strategy;

/**
 * Класс вывода рисунков на консоль
 * @author Maksim Katorgin
 * @since 0.1
 * @version $Id$
 */
public class Paint {
    /**
     * Вывод рисунка на консоль
     * @param shape - рисунок
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    /**
     * Старт программы
     * @param args
     */
    public static void main(String[] args) {
       Paint paint = new Paint();
       paint.draw(new Triangle());
       paint.draw(new Square());

    }

}
