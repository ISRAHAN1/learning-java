package Glava_1.Task_1_4_10;
import java.util.Scanner;
public class SWITCH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день  недели:");
        String weekday = in.nextLine();
        System.out.println(isWeekend((weekday)));
    }
    public static boolean isWeekend(String weekday) {
        boolean result;
        switch (weekday) {
            case "Sunday","Saturday":
                result=true;
                break;
            default:
                 result=false;
        }
        return result;

    }
}