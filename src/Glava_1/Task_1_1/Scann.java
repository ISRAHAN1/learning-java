package Glava_1.Task_1_1;

import java.util.Random;
import java.util.Scanner;

public class Scann {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int value = random.nextInt(100) + 1;
        int chet = 1;
        int answer;
        boolean guessed = false;

        do {
            System.out.println("Попытка номер №-" + chet);
            answer = scanner.nextInt();
            if (answer < value) {
                System.out.println("ответ меньше заданного");
            } else if (answer > value) {
                System.out.println("ответ больше заданного");
            } else {
                guessed = true;
                break;
            }
            chet++;
        }
        while (chet <= 10);
        if (guessed) {
            System.out.println("вы угадали число с-" + chet + " попытки ");
        } else {
            System.out.println("вы использовали все попытки, правильном числом было-" + value);
        }
        System.out.println("finish");
    }
}


