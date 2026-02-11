package Glava_1.Task_1_12;

public class Age {
    public static void main(String[] args) {
        Age age = new Age();
        int bonus = age.determineGroup(10);
        System.out.println("это относиться к " + bonus +"-группе");


    }

    public int determineGroup(int age) {
        int result;
        if (age < 7) {
            result = -1;
        } else if (age < 14) {
            result = 1;
        } else if (age < 18) {
            result = 2;
        } else if (age <= 65) {
            result = 3;
        } else {
            result = -1;
        }
        return result;
    }
}
