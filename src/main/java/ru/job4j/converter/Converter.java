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
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        float rubleEu = Converter.euroToRuble(5);
        float rubleDo = Converter.dolarToRuble(52);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
        System.out.println("5 euro are " + rubleEu + " rubles.");
        System.out.println("52 dollars are " + rubleDo + " rubles.");

    }
}
