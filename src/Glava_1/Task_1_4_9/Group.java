package Glava_1.Task_1_4_9;
import java.util.Scanner;
public class Group {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input age:");
        int age = in.nextInt();
        System.out.println(determineGroup(age));
    }
    public static int determineGroup(int age) {
        int result;
        if (age<7) {
            result=-1;
        } else if (age < 14) {
           result=1;
        } else if (age < 18) {
            result=2;
        } else if (age <= 65) {
            result=3;
        } else{
            result=-1;
        }
        return result;
        
    }
}