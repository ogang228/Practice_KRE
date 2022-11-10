package practice.task7.a;

import practice.function.Function;

public class Main {
    public static void main(String[] args) {

        double a = 0;
        int amount = 0;

        for (int k = 1; k < 10000; k++) {
            amount++;
            a += (Function.function14(k) * k) / k;

            if (a < -1000) {
                System.out.println("Amount of iteration = " + amount);
                System.out.println("Sum A = " + a);
                break;
            }
        }
    }
}
