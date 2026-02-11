package Glava_1.Task_1_13;
public class DE {
    public static void main(String[] args) {
        String string="Weekday";
        System.out.println(isWeekend(string));

    }
    public static boolean isWeekend(String weekday){
        boolean result;
        switch (weekday){
            case "Sunday","Saturday":
                result=true;
                break;
            default:
                result=false;
        }
        return result;
    }


}
