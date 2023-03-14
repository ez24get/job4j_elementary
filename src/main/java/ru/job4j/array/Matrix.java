package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        array[0][0] = 1;
        int row = 1, column = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = row * column;
                column++;
            }
            row++;
            column = 1;
        }
        return array;
    }
}
