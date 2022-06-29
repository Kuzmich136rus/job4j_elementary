package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
        Point c = new Point(13, 7);
        Point d = new Point(54, 22);
        double dist2 = c.distance(d);
        System.out.println(dist2);
        Point e = new Point(-12, 3);
        Point f = new Point(21, -47);
        double dist3 = e.distance(f);
        System.out.println(dist3);
    }
}
