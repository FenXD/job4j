package ru.job4j.max;

/**
 * Вычисление максимума
 */
public class Max {
    /**
     * Вычисление максимума
     * @param first - червое число
     * @param second - второе число
     * @return максимальное из двух
     */
    public int max(int first, int second) {
          return first < second ? second : first;
    }

    public int max(int first, int second, int third) {
        return max(max(first, second),third);
        }
}