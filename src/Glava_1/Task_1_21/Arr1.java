package Glava_1.Task_1_21;

import java.math.BigInteger;
import java.util.Arrays;

public class Arr1 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(MaxVal(BigInteger.valueOf(a)));

        int[] numbers = new int[]{4, 3, 2, 4, 2, 6, 7, 8, 9, 9, 4};
        System.out.print(Arrays.toString(getArray(numbers)));
    }

    public static int[] getArray(int[] numbers) {
        int[] result = new int[numbers.length];
        if (result.length == 1 || result.length == 0) {
            return numbers;
        }
        int length = numbers.length % 2 == 0 ? 2 : 1;
        int[] res = new int[length];

        int index = (numbers.length - length) / 2;
        System.arraycopy(numbers, index, res, 0, length);
        return res;
    }
    public static BigInteger MaxVal( BigInteger a){
        return a.multiply(a);
    }
}