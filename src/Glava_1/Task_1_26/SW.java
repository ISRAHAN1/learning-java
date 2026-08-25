package Glava_1.Task_1_26;
import java.util.Scanner;

public class SW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите номер месяца  (1-12):  ");
        int month = scanner.nextInt();
        System.out.println(getMonth(month));
    }
    public  static  String getMonth(int month){
        String season;
        switch (month){
            case 1,2,12: season="зима";
            break;
            case 3,4,5: season="весна";
            break;
            case 6,7,8: season ="лето";
            break;
            case 9,10,11:season="осень";
            break;
            default:
                season = null;
                System.out.println("ошибка нет такого сезона");
                break;
        }
                return season;
    }
}
