package Glava_1.Task_1_17;

public class Chet {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 8, 17};
        int[] a = getArrayMiddle(numbers);
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (s != 0) {
                System.out.print(",");
            }
            System.out.print(a[i]);
            s = 1;
        }
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                int[] result1 = new int[2];
                result1[0] = numbers[numbers.length / 2 - 1];
                result1[1] = numbers[numbers.length / 2];
                return result1;
            } else {
                int[] result2 = new int[1];
                result2[0] = numbers[numbers.length / 2];
                return result2;
            }
        } else {
            return numbers;
        }
    }
}
