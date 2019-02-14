package ru.job4j.array;

public class ArraysQuest {
    public int[] thirdArray(int[] first, int[] second) {
        int firstIndex = 0;
        int secondIndex = 0;
        int[] third = new int[first.length + second.length];
        for (int i = 0; i < third.length; i++) {
            if (first[firstIndex] < second[secondIndex]) {
                third[i] = first[firstIndex];
                if (firstIndex < first.length - 1) {
                    firstIndex++;
                }
            } else {
                third[i] = second[secondIndex];
                if (secondIndex < second.length - 1) {
                    secondIndex++;
                }

            }
        }
        return third;
    }
}
