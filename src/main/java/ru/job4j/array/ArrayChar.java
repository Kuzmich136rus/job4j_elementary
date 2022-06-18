package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int index = 0;
        while (index< pref.length && result) {
            if (word[index] != pref[index]) {
                result = false;
            }
            index++;
        }
        return result;
    }
}
