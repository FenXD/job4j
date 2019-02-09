package ru.job4j.loop;

/**
 * Рисование шаххматной доски
 * @author Maksim Katorgin
 * @version 0.1
 * @since 09.02.2019
 */
public class Board {
    /**
     * Печать доски
     * @param height - высота
     * @param width - ширина
     * @return - доска
     */
    public String paint(int height, int width) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((j + i) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
