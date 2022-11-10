package practice.task2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(7, 6), new Point(-7, 8));

        double sideA = Math.sqrt(Math.pow(triangle.getA().getX() - triangle.getB().getX(), 2) + Math.pow(triangle.getB().getY() - triangle.getB().getY(), 2));
        double sideB = Math.sqrt(Math.pow(triangle.getB().getX() - triangle.getC().getX(), 2) + Math.pow(triangle.getB().getY() - triangle.getC().getY(), 2));
        double sideC = Math.sqrt(Math.pow(triangle.getC().getX() - triangle.getA().getX(), 2) + Math.pow(triangle.getC().getY() - triangle.getA().getY(), 2));

        double semiP = (sideA + sideB + sideC) / 2;

        double S = Math.sqrt(semiP * (semiP - sideA) * (semiP - sideB) * (semiP - sideC));
        double Hb = 2 * S / sideB;

        double Wa = 2 * Math.sqrt(sideA * sideB * sideC * (semiP - sideA)) / sideB + sideC;

        System.out.println("Hb = " + Hb);
        System.out.println("Wa = " + Wa);
    }
}
