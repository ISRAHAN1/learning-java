package Glava_1.Task_1_22;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 7, 5};
        int[] number1 = new int[]{8, 4, 2, 4};
        int[]result= getArrays(numbers, number1);
        System.out.println(Arrays.toString(result));


    }

    public static int[] getArrays(int[] firstArray, int[] secondArray) {
        int [] result =  new int[firstArray.length+secondArray.length];
        System.arraycopy(firstArray,0,result,0,firstArray.length);
        System.arraycopy(secondArray,0,result,firstArray.length,secondArray.length);
        Arrays.sort(result);
        return result;
    }
}