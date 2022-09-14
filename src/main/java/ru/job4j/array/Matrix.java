package ru.job4j.array;

import java.io.FileOutputStream;
import java.io.IOException;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] rsl = multiple(9);
        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            for (int i = 0; i < rsl.length; i++) {
                for (int j = 0; j < rsl[0].length; j++) {
                    out.write((rsl[i][j] + " ").getBytes());
                    if (j == rsl.length - 1) {
                        out.write(System.lineSeparator().getBytes());
                    }
                }
            }
        out.write(System.lineSeparator().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
