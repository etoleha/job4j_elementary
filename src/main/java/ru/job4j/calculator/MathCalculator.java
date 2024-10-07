package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumSubstractAndDivide(double first, double second) {
        return substract(first, second) +div(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + div(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат 2 расчета равен: " + sumSubstractAndDivide(10, 20));
        System.out.println("Результат 3 расчета равен: " + sumAll(10, 20));
    }
}