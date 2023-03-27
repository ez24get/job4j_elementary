package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return max(left, (max(right, third)));
    }

    public static int max(int left, int right, int third, int fourth) {
        return max(left, max(right, max(third, fourth)));
    }

    public static void main(String[] args) {
        int msg = Max.max(1, 2);
        System.out.println(msg);
        int msg3 = Max.max(1, 2, 3);
        System.out.println(msg3);
        int msg4 = Max.max(1, 2, 3, 4);
        System.out.println(msg4);
    }
}