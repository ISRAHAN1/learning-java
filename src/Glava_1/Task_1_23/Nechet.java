package Glava_1.Task_1_23;
public class Nechet {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(numbers);
    }
    public static void printOddNumbers(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                if (a != 0) {
                    System.out.print(",");
                }
                System.out.print(arr[i]);
            }
            a = 1;
        }
        System.out.println();
    }
}
