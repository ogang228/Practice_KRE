package practice.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount gallon and sack: ");
        int amount = scanner.nextInt();

        double gallon = -0.0347;
        double sack = 3.785;

        for (int i = 0; i < amount; i++) {
            gallon += gallon;
            sack += sack;

            System.out.println("Gallon: " + gallon + ", sack: " + sack);
        }
    }
}
