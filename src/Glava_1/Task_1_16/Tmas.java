package Glava_1.Task_1_16;

public class Tmas {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 6, 7, 9, 12, 14};
        int start = 7;
        int end = 13;
        int[] res = getSubArrayBetween(numbers, start, end);
        int s = 0;
        for (int i = 0; i < res.length ; i++) {
            if (s != 0) {
                System.out.print(",");
            }
            System.out.print(res[i]);
            s = 1;
        }
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int f = 0;
        int k = 0;
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                k++;
            }
        }
        int[] result = new int[k];
        for (int j = 0; j < numbers.length ; j++) {
            if (numbers[j] >= start && numbers[j] <= end) {
                result[f++] = numbers[j];
            }
        }
        return result;
    }
}
