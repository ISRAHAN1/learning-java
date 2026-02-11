package Glava_1.Task_1_18;

public class Pos {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 3, 7, 5};
        int[] secondArray = new int[]{8, 4, 2, 4};
        int[]result=mergeAndSort(firstArray,secondArray);
        int kol=0;
        for(int i=0; i<result.length;i++){
            if(kol!=0){
                System.out.print(",");
            }
            System.out.print(result[i]);
            kol=1;
        }

    }


    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int k = 0;
        int[] result = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            result[k++] = firstArray[i];
        }
        for (int j = 0; j < secondArray.length; j++) {
            result[k++] = secondArray[j];
        }
        for (int a = 0; a < result.length; a++) {
            for (int b = 0; b < result.length - a - 1; b++) {
                if(result[b+1]<result[b]){
                    int n =result[b];
                    result[b]=result[b+1];
                    result[b+1]=n;
                }
            }
        }
        return result;
    }
}
