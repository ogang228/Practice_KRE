package practice.task1;

public class Main {
    public static void main(String[] args) {
        int m = 5;
        int h = 10;
        int v = 15;
        double g = 9.8;

        double E = m * Math.pow(v, 2) / 2;
        double P = m * g * h;

        System.out.println("Е = " + E);
        System.out.println("P = " + P);
    }
}
