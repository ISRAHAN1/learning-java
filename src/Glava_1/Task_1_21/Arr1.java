package Glava_1.Task_1_21;

import java.util.Arrays;

public class Arr1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{4, 3, 2, 4, 2, 3};
        System.out.print(Arrays.toString(getArray(numbers)));
    }

    public static int[] getArray(int[] numbers) {
        int[] result = new int[numbers.length];
        if (numbers.length == 0 || numbers.length == 1) {
            return result;
        }
        int lengthArr = (numbers.length % 2 == 0 ? 2 : 1);
        int[] resulLength = new int[lengthArr];

        int start = (numbers.length - lengthArr) / 2;
        System.arraycopy(numbers, start, resulLength,0,lengthArr);
        return resulLength;
    }
}