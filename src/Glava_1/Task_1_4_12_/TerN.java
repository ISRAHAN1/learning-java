package Glava_1.Task_1_4_12_;
import java.util.Scanner;
public class TerN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день недели:");
        String weekday=in.nextLine();
        System.out.print(isWeekend(weekday));

        }
    public static String isWeekend(String weekday) {
        String aws;
        aws = weekday.equals("Sunday")||weekday.equals("Saturday")? "Ура, выходной!":"Надо еще поработать";
        return aws;
    }

    }

