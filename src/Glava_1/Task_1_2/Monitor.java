package Glava_1.Task_1_2;

public class Monitor {
    public static void main(String[] args) {
        int monitors = 50;
        int programmers = 2;
        System.out.println(drawMonitors(monitors,programmers));

    }

    public static int drawMonitors(int a, int b) {
        return a % b;

    }
}
