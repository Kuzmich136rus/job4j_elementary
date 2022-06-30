package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax7To3Then7() {
        int left = 7;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 7;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax14To34Then34() {
        int left = 14;
        int right = 34;
        int result = Max.max(left, right);
        int expected = 34;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax15To1To33Then33() {
        int first = 15;
        int second = 1;
        int third = 33;
        int result = Max.max(first, second, third);
        int expected = 33;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax0ToMin5ToMin5To4Then4() {
        int a = 0;
        int b = -5;
        int c = -5;
        int d = 4;
        int result = Max.max(a, b, c, d);
        int expected = 4;
        assertEquals(result, expected);
    }
}
