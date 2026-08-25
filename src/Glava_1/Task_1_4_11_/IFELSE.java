package Glava_1.Task_1_4_11_;
import java.util.Scanner;
public class IFELSE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input day -");
        String weekday = in.nextLine();
        System.out.println(isWeekend((weekday)));
    }

    public static boolean isWeekend(String weekday) {
        boolean result;
        if(weekday.equals("Sunday")||weekday.equals("Saturday")) {
            result = true;
        } else{
            result=false;
        }
        return result;
    }

}


