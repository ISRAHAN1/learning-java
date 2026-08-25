package Glava_1.Task_1_5_4_;
import java.util.Arrays;

public class Vos {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 9, 11, 24};
        int start = 4;
        int end = 10;
        int[] a = getSubArrayBetween(numbers, start, end);
        System.out.print(Arrays.toString(a));
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int k = 0;
        int f=0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                k++;
            }
        }
       System.out.print(k);
        int[]result=new int[k];
        for(int j=0; j<numbers.length-1; j++){
            if (numbers[j] >= start && numbers[j] <= end){
                result[f++]=numbers[j];
            }
        }
        return result;
    }
}
