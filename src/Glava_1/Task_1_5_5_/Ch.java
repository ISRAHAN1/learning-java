package Glava_1.Task_1_5_5_;

import java.util.Arrays;

public class Ch {
    public static void main(String[] args) {
        int[] numbers = {14, 16, 3, 18, 6, 7, 5};
        int[] a = getArrayMiddle(numbers);
        System.out.println(Arrays.toString(a));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                int[] arr = new int[2];
                arr[0] = numbers[numbers.length / 2 - 1];
                arr[1] = numbers[numbers.length / 2];
                return arr;
            } else {
                int[] arr1 = new int[1];
                arr1[0] = numbers[numbers.length / 2];
                return arr1;
            }
        } else {
            return numbers;
        }
    }
}



