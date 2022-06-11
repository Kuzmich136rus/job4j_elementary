package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rslx = x2 - x1;
        rslx = Math.pow(rslx, 2);
        double rsly = y2 - y1;
        rsly = Math.pow(rsly, 2);
        double rsl = rslx + rsly;
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(13, 7, 54, 22);
        System.out.println("result (13, 7) to (54, 22) " + result2);
        double result3 = Point.distance(-12, 3, 21, -47);
        System.out.println("result (-12, 3) to (21, -47) " + result3);
    }
}
