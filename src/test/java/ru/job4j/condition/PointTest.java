package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMin113to73then12dot8() {
        int x1 = -1;
        int y1 = 13;
        int x2 = 7;
        int y2 = 3;
        double expected = 12.8;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when795to2541then264dot28() {
        int x1 = 7;
        int y1 = 95;
        int x2 = 254;
        int y2 = 1;
        double expected = 264.28;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMin13toMin812then11dot4() {
        int x1 = -1;
        int y1 = -3;
        int x2 = -8;
        int y2 = -12;
        double expected = 11.4;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}