package Glava_1.SCANNERRS;
import java.util.Scanner;
import java.util.Random;

public class DOIT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int answer;
        int count = 1;
        int value = random.nextInt(100) + 1;
        do {
            System.out.println("Угадайте число, которое загадал компьютер. Попытка №" + count);
            answer = input.nextInt();
            if (answer < value) {
                System.out.println("Не угадали, ваше число меньше загаданного");
            } else if (answer > value) {
                System.out.println("Не угадали, ваше число больше загаданного");
            }
            if (count > 14) {
                System.out.println("Игра завершина");
                break;
            }
            count++;
        }
        while (answer != value);
        System.out.println("ура вы выиграли");
        }
    }
