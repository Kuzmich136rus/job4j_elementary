package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dolarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(in + " rubles are " + expected + ". Test result : " + passed);
        float in2 = 5;
        float expected2 = 350;
        float out2 = Converter.euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println(in2 + " euro are " + expected2 + ". Test result : " + passed2);
        float in3 = 360;
        float expected3 = 6;
        float out3 = Converter.rubleToDollar(in3);
        boolean passed3 = expected3 == out3;
        System.out.println(in3 + " rubles are " + expected3 + ". Test result : " + passed3);
        float in4 = 50;
        float expected4 = 3000;
        float out4 = Converter.dolarToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println(in4 + " dollars are " + expected4 + ". Test result : " + passed4);

    }
}
