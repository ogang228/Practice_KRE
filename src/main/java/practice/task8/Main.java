package practice.task8;

import practice.function.Function;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Double, Double> table = new HashMap<>();
        double sum = 0;
        int amount = 0;

        for (double x = 0; x < 20; x += 0.1) {
            double y = Function.function15(x);
            table.put(x, y);
        }

        table.forEach((k, v) -> System.out.println("X = " + k + " Y = " + v));

        for (double value : table.values()) {
            if (value > 0) {
                sum += value;
            }
        }

        if (sum == 0) {
            System.out.println("The function has never been positive!");
        } else {
        System.out.println("Sum of all positive values of the function y = " + sum);
        }

        amount = (int) table.entrySet().stream().filter(v -> v.getValue() < 0).count();

        System.out.println("Amount of negative y = " + amount);

    }
}
