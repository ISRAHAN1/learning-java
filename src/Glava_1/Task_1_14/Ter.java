package Glava_1.Task_1_14;

public class Ter {
    public static void main(String[] args) {
        String s ="Sunday";
        System.out.println(CheckWeekday(s));

    }
    public static String CheckWeekday(String weekday){
        return weekday.equalsIgnoreCase("Sunday")||weekday.equalsIgnoreCase("Saturday")? "Ура выходной": "надо еще поработать";

    }

}
