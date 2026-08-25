package Glava_1.Task_1_5_3;
public class Massive {
    public static void main(String[] args) {
        int[] numbers ={1, 2, 3, 4, 5, 6, 7, 7,};
         printArray(numbers);
        }
    public static void printArray(int[] numbers) {
        System.out.print(        "["        );
        for (int i=0;i<numbers.length;i++ ) {
            if(i>0){
                System.out.print(",");
            }
            System.out.print(numbers[i]);

            }
        System.out.print(         "]"       );


    }
}