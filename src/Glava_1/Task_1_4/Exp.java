package Glava_1.Task_1_4;

public class Exp {
    public static void main(String[] args) {
        double a = 1.3;
        double b = 2.4;
        double c = 6.4;
        System.out.println(doubleExpression(a, b, c));

    }

    public static boolean doubleExpression(double a, double b, double c) {
        return a + b -c < 1E-4;
    }
}
