package practice.task3.b;

import practice.function.Function;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Please select a job type.
                    [a] - type A.
                    [b] - type B.
                    [c] - type C.
                    """);

            String choice = scanner.nextLine();

            switch (choice) {
                case "a" -> {
                    int salaryY = (int) (100 * Math.abs(Function.function9(12) + 50));
                    int tax = (salaryY / 100) * 10;
                    int salaryToPaid = salaryY - tax;

                    System.out.println("Salary type A:" + salaryY);
                    System.out.println("Tax type A:" + tax);
                    System.out.println("Salary to be paid type A: " + salaryToPaid);
                }
                case "b" -> {
                    int salaryY = (int) (150 * Math.abs(Function.function10(12) + 100));
                    int tax = (salaryY / 100) * 15;
                    int salaryToPaid = salaryY - tax;

                    System.out.println("Salary type B:" + salaryY);
                    System.out.println("Tax type B:" + tax);
                    System.out.println("Salary to be paid type B: " + salaryToPaid);
                }
                case "c" -> {
                    int salaryY = (int) (200 * Math.abs(Function.function11(12) + 135));
                    int tax = (salaryY / 100) * 20;
                    int salaryToPaid = salaryY - tax;

                    System.out.println("Salary type C:" + salaryY);
                    System.out.println("Tax type C:" + tax);
                    System.out.println("Salary to be paid type C: " + salaryToPaid);
                }
                default -> {
                    System.out.println("There is no such input!");
                }
            }
        }
    }
}
