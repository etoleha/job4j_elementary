package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        ages[0] = 1;
        surnames[0] = "John";
        prices[0] = 1;
        System.out.println(ages[0]);
        System.out.println(surnames[0]);
        System.out.println(prices[0]);
    }
}
