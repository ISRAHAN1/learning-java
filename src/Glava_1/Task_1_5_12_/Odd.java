package Glava_1.Task_1_5_12_;


public class Odd {
    public static void main(String[] args) {
        int[]arr={3,5,20,8,7,3,100};
        printOddNumbers(arr);

    }
    public static void printOddNumbers(int[] arr) {
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                if (result != 0)
                    System.out.print(",");
                System.out.print(arr[i]);
                result = 1;
            }
        }
        System.out.print("\n");
    }
}



