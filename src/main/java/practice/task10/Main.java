package practice.task10;

import practice.function.Function;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = new double[7];
        double y = 0;

        for (int k = 0; k < 7; k++) {
            y = Function.function17(k);
            array[k] = y;
        }

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Penultimate positive element = " + Array.get(array, 6));
    }
}
