package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int index = 1;
        while (index < data.length) {
            if (data[index] != data[0]) {
                result = false;
            }
            index++;
        }
        return result;
    }
}
