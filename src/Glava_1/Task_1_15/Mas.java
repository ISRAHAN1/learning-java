package Glava_1.Task_1_15;

public class Mas {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8,9};
        printArray(numbers);

    }

    public static void printArray(int[] array) {
        System.out.print("[");
        int a=0;
        for (int i = 0; i < array.length; i++) {
            if(a!=0){
                System.out.print(",");
            }
            System.out.print(array[i]);
            a=1;
        }
        System.out.print("]");
        }

    }



