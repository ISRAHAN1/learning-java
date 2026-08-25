package Glava_1.Task_1_6_10_;
import java.lang.Math;
public class Dif {
    public static void main(String[] args) {
        String number="5";
        System.out.print(parseAndSqrt(number));
    }


    public static long parseAndSqrt(String number) {
        long result=Long.parseLong(number);
        return (long) Math.sqrt(Math.round(result));
    }
}