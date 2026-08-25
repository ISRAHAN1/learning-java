package Glava_1.Task_1_5_6_;

import java.util.Arrays;

public class Raz {
    public static void main(String[]args){
        int[]numbers={1,4,6,7};
        int[]a=inverseArray(numbers);
        System.out.println(Arrays.toString(a));
    }
    public static int[] inverseArray(int[] numbers) {
        int k=0;
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[numbers.length-1-i] = numbers[k++];
            }
        return result;
    }
}
