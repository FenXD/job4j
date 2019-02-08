package ru.job4j.loop;

/**
 * Рассчет факториала числа
 */
public class Factorial {
    /**
     * Метод расчета факториала
     * @param n - число,факторал которого надорасчитать
     * @return факториал
     */
    public int calc(int n) {
        int fac = 1;
            while (n > 0) {
                fac = fac * n;
                n--;
            }
    return fac;
    }
}
