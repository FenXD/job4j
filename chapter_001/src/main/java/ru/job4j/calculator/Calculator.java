package ru.job4j.calculator;

/**
 * Простейший калкуляток
 */
public class Calculator {
    private double result;

    /**
     * Сложение
     * @param first - первое слагаемое
     * @param second - творое слагаемое
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Вычитание
     * @param first - уменьшаемое
     * @param second - вычитаемое
     */
    public void substract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Деление
     * @param first - делимое
     * @param second - делитель
     */
    public void divide(double first, double second) {
        this.result = first / second;
    }

    /**
     * Умножение
     * @param first - превый множитель
     * @param second - второй множитель
     */
    public void multiply(double first, double second) {
        this.result = first * second;
    }

    /**
     * Получение результата действия
     * @return результат
     */
    public double getResult() {
        return this.result;
    }
}

