package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double per = (a + b + c) / 2;
        double rsl = per * (per - a) * (per - b) * (per - c);
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
