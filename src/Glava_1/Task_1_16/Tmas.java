package Glava_1.Task_1_16;

public class Tmas {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 6, 7, 9, 12, 14};
        int start = 6;
        int end = 11;
        int[] res = getSubArrayBetween(numbers, start, end);
        int a = 0;
        for (int i = 0; i < res.length; i++) {
            if (a != 0) {
                System.out.print(",");
            }
            System.out.print(res[i]);
            a = 1;
        }
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int k = 0;
        int f = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                k++;
            }
        }
        System.out.println(k);
        System.out.println(k);
        System.out.println(k);
        int[] result = new int[k];
        for (int number : numbers) {
            if (number >= start && number <= end) {
                result[f++] = number;
            }
        }
        return result;
    }
}