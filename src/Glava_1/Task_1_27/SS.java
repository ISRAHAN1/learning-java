package Glava_1.Task_1_27;

import java.util.Scanner;
public class SS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ведите оператор (+, -, *, /): ");
        String operator = scanner.next();
        System.out.println("Ведите второе значени:");
        double num2 = scanner.nextDouble();
        System.out.println(getCalculation(num1, operator, num2));
    }

    public static double getCalculation(double num1, String operator, double num2) {
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0 || num1 == 0) {
                    System.out.println("числа на ноль не деляться ");

                } else {
                    result =  num1 / num2;
                }
                break;
            default:
                System.out.println("Неизвестная операция ");
                break;
        }
        return result;
    }
}
