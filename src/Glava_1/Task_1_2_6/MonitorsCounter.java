package Glava_1.Task_1_2_6;
import java.util.Scanner;
public class MonitorsCounter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int monitors=in.nextInt();
        int programmers=in.nextInt();
        System.out.println(drawIsMonitorsCounter( monitors,programmers));
    }
    public static int drawIsMonitorsCounter(int monitors, int programmers) {
        return  monitors % programmers;
    }
}