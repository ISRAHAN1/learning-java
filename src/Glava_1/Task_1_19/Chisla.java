package Glava_1.Task_1_19;

public class Chisla {
    public static void main(String[] args) {
        int[]numbers=new int[]{1,4,6,7};
        int[]result=inverseArray(numbers);
        int a=0;
        for (int i=0; i<result.length;i++){
            if(a!=0){
                System.out.print(",");
            }
            System.out.print(result[i]);
            a=1;
        }


    }
    public static int[]inverseArray(int[]numbers){
        int[] result=new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            result[numbers.length-1-i]=numbers[i];
        }
        return result;
    }
}
