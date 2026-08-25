package Glava_1.Task_1_2_13;
import java.util.Scanner;
import java.lang.Math;
public class Okr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("square-");
        double area = in.nextDouble();
        double ros= calcCircleRadius( area);
        System.out.printf("square-%.0f radius-%.3f",+area,ros);

    }
    public static double calcCircleRadius(double area) {
        return (Math.sqrt((area)/ Math.PI));
    }

}
