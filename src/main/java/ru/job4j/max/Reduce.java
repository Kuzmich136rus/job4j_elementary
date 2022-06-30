package ru.job4j.max;

public class Reduce {
    private int[] arrayMain;

    public void to(int[] array) {
        arrayMain = array;
    }

    public void print() {
        for (int index = 0; index < arrayMain.length; index++) {
            System.out.println(arrayMain[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
