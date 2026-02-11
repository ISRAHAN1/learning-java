package Glava_1.Task_1_5;

public class Rad {
    public static void main(String[] args) {
        double area = 123;
        double res = circleArea(area);
        System.out.printf("square-%.0f radius-%.3f",+area ,res);

    }

    public static double circleArea(double area) {
        return Math.sqrt(area / Math.PI);
    }
}
