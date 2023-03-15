package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = 1;
        while (i < array.length - 1) {
            if (array[i] + array[j] == target) {
                result[0] = i;
                result[1] = j;
                return result;
            }
            if (array[i] + array[j] != target) {
                j++;
            }
            if (j == array.length - 1) {
                i++;
                j = i + 1;
            }
            if (j == array.length) {
                break;
            }
        }
        return new int[0];
    }
}