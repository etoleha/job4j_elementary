package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Atos";
        names[1] = "Portos";
        names[2] = "Aramis";
        names[3] = "Denis";
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("ages length = " + ages.length);
        System.out.println("surnames length = " + surnames.length);
        System.out.println("prices length = " + prices.length);
    }
}
