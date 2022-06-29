package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(second, third) > first ? max(second, third) : first;
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, b) > max(c, d) ? max(a, b) : max(c, d);
    }
}
