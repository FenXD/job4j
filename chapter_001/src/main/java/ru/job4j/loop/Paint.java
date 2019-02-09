package ru.job4j.loop;
import java.util.function.BiPredicate;
/**
 * Пирамида
 * @author Maksim Katorgin
 * @version 0.1
 * @sicne 09.02.2019
 */
public class Paint {
    /**
     * Рисование пирамиды
     * @param height - высота пирамиды
     * @return Пирамида
     */
    public String pyramid(int height) {
        return this.loop(height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column);
    }

    /**
     * Треугольник
     * @param height - высота
     * @return рисунок
     */
    public String rightTrl(int height) {
        return this.loop(
                height,
                height,
                (row, column) -> row >= column
        );
    }
    /**
     * Треугольник
     * @param height - высота
     * @return рисунок
     */
    public String leftTrl(int height) {
        return this.loop(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }
    /**
     * Универстальный метод
     * @param height - высота
     * @param width - ширина
     * @param predict - условие
     * @return рисунок
     */
    private String loop(int height, int width, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
