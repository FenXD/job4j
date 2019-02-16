package ru.job4j.array;

public class ArraysQuest {
    public int[] thirdArray(int[] first, int[] second) {
        int firstIndex = 0;
        int secondIndex = 0;
        int[] third = new int[first.length + second.length];
        for (int i = 0; i < third.length - 1; i++) {
            if (first[firstIndex] < second[secondIndex]) {
                third[i] = first[firstIndex];
                    firstIndex++;
            } else {
                third[i] = second[secondIndex];
                secondIndex++;
            }


        }
        if (firstIndex != first.length - 1) {
            third[third.length - 1] = second[secondIndex];
        }
        if (secondIndex != second.length - 1) {
            third[third.length - 1] = first[firstIndex];
        }
        return third;
    }
}

