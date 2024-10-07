package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            total *= (100 + percent) / 100;
            total += annualDeposit;
            years += 1;
        } while (total < goal);
        return years;
    }
}
