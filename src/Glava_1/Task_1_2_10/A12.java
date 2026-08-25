package Glava_1.Task_1_2_10;
public class A12 {
    public static void main(String[] args) {
        byte a=12;
        byte b=12;
        byte c=24;
        System.out.println(doubleExpression(a,b,c));
        }
    public static boolean doubleExpression(double a, double b, double c) {
        return  a+b-c<1E-4;
    }

    }




