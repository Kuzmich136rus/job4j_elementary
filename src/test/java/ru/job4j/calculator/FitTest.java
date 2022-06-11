package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenWoman168Then66dot6() {
        short in = 168;
        double expected = 66.6;
        double out = Fit.womanWeight(in);
        assertEquals(expected, out, 0.1);
    }
}