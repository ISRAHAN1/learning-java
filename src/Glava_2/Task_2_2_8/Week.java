package Glava_2.Task_2_2_8;
public class Week {
    public static void main(String[] args) {
        String dayName = "Monday";
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(isWeekend(dayName));
        System.out.println(weekendCounts(days));
        System.out.println(weekdayCount(days));
    }

    public static boolean isWeekend(String dayName) {
        if (dayName.equals("Saturday") || dayName.equals("Sunday")) {
            return true;
        } else {
            return false;
        }
    }

    public static int weekendCounts(String[] days) {
        int k = 0;
        for (int i = 0; i <= days.length - 1; i++) {
            if (isWeekend(days[i])) {
                k++;
            }
        }
        return k;
    }
    public static int weekdayCount(String[] days){
        return days.length-weekendCounts(days);
    }
}

