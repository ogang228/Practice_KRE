package practice.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter letter U or P or A or C or J: ");
        Country country1 = new Country("Ukraine", "Eurasia");
        Country country2 = new Country("Poland", "Eurasia");
        Country country3 = new Country("USA", "North America");
        Country country4 = new Country("Canada", "North America");
        Country country5 = new Country("Japan", "Asia");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();


        switch (choice) {
            case "U" ->
                    System.out.println("Country = " + country1.getName() + ", continent = " + country1.getContinent());
            case "P" ->
                    System.out.println("Country = " + country2.getName() + ", continent = " + country2.getContinent());
            case "A" ->
                    System.out.println("Country = " + country3.getName() + ", continent = " + country3.getContinent());
            case "C" ->
                    System.out.println("Country = " + country4.getName() + ", continent = " + country4.getContinent());
            case "J" ->
                    System.out.println("Country = " + country5.getName() + ", continent = " + country5.getContinent());
        }

        if (choice.equals("U")) {
            System.out.println("Country = " + country1.getName() + ", continent = " + country1.getContinent());
        } else if (choice.equals("P")) {
            System.out.println("Country = " + country2.getName() + ", continent = " + country2.getContinent());
        } else if (choice.equals("A")) {
            System.out.println("Country = " + country3.getName() + ", continent = " + country3.getContinent());
        } else if (choice.equals("C")) {
            System.out.println("Country = " + country4.getName() + ", continent = " + country4.getContinent());
        } else if (choice.equals("J")) {
            System.out.println("Country = " + country5.getName() + ", continent = " + country5.getContinent());
        }
    }
}

