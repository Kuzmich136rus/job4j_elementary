package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom7To7Then0() {
        int start = 7;
        int finish = 7;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertEquals(expected, result);
    }
}