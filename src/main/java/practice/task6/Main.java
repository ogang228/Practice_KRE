package practice.task6;

import practice.function.Function;

public class Main {
    public static void main(String[] args) {

        double function14 = Function.function14(1);
        double function15 = Function.function15(1);
        double x = 0;
        double y = 1;
        double z = 0;

        int I = 12;

        for (int i = 0; i < I; i++) {
            x += i * function14;
        }

        for (int i = 0; i < I; i++) {
            y *= function15;
        }

        z = x * y;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Z = " + z);

    }
}
