package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result1 = x2 - x1;
        double result2 = y2 - y1;
        double result3 = Math.pow(result1, 2);
        double result4 = Math.pow(result2, 2);
        double result5 = result3 + result4;
        double result6 = Math.sqrt(result5);
        return result6;
    }

    public static void main(String[] args) {
        double result = Point.distance(12, 3, 2, 34);
        System.out.println("result (12, 3) to (2, 34) " + result);
    }
}
