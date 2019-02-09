package ru.job4j.loop;

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
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
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
