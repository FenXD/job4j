package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] arr) {
        boolean result = true;
        for (int i = 0; i != arr.length - 1; i++) {
            if (arr[i][i] != arr[0][0] | arr[i][arr.length - i - 1] != arr[0][arr.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
