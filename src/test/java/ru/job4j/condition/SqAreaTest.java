package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K3Square2dot29() {
        int p = 7;
        double k = 3;
        double expected = 2.29;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP0K2Square0() {
        int p = 0;
        double k = 2;
        double expected = 0;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}