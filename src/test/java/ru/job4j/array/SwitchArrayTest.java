package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapMiddleToNext() {
        int[] input = {13, 23, 33, 53, 43, 63, 73, 83};
        int source = 4;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {13, 23, 33, 43, 53, 63, 73, 83};
        assertArrayEquals(expected, result);
    }
}