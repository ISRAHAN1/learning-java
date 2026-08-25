package Glava_1.Task_1_5_10_;
import java.util.Arrays;
public class SerM {
    public static void main(String[] args) {
        int[] numbers = {14, 16, 3, 6, 8, 4};
        int[] resulT = getArrayMiddle(numbers);
        System.out.print(Arrays.toString(resulT));
    }
    public static int[] getArrayMiddle(int[] numbers) {
        if(numbers == null || numbers.length < 2){
            return numbers;
        }
            int result1 = numbers.length / 2 + numbers.length % 2 - 1;
            int result2 = result1 + 2 -numbers.length % 2;
            return Arrays.copyOfRange(numbers, result1, result2);
    }
}

