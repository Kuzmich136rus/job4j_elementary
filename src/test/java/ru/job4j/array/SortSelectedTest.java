package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {34, 0, -12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-12, 0, 34};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5elementsTwo() {
        int[] data = new int[] {4, -5, 2, 0, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-5, 0, 2, 2, 4};
        assertArrayEquals(expected, result);
    }
}