package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double result = a.distance(b);
        double expected = 2;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenMin113to73then12dot8() {
        Point a = new Point(-1, 13);
        Point b = new Point(7, 3);
        double result = a.distance(b);
        double expected = 12.8;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void when795to2541then264dot28() {
        Point a = new Point(7, 95);
        Point b = new Point(254, 1);
        double result = a.distance(b);
        double expected = 264.28;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenMin13toMin812then11dot4() {
        Point a = new Point(-1, -3);
        Point b = new Point(-8, -12);
        double result = a.distance(b);
        double expected = 11.4;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void when003to123then2Dot23() {
        Point a = new Point(0,0,3 );
        Point b = new Point(1, 2, 3);
        double result = a.distance3d(b);
        double expected = 2.23;
        assertEquals(expected, result, 0.01);
    }

}