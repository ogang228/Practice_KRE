package practice.task9;

import practice.function.Function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Integer[] years = {1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001};

        Map<Integer, Double> map = new HashMap<>();
        double y = 0;

        for (int x = 0; x < years.length; x++) {
            y = 100 * Function.function17(x);
            map.put(years[x], y);

            if (y > 0) {
                System.out.println("This year: " + years[x] + " company had income = " + y);
            } else if (y < 0) {
                System.out.println("This year: " + years[x] + " company had loss = " + y);
            } else {
                System.out.println("This year: " + years[x] + " company did not make any profit or loss = " + y);
            }
        }

        List<Map.Entry<Integer, Double>> countYear = map.entrySet().stream().filter(v -> v.getValue() > 200 && v.getValue() < 700).collect(Collectors.toList());
        System.out.println("The firm's revenues ranged from 200 to 700: " + countYear);
    }
}
