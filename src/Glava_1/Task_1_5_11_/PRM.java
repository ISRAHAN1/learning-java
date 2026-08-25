package Glava_1.Task_1_5_11_;
import java.util.Arrays;
public class PRM {
        public static void main(String[] args) {
            int[] firstArray ={1, 3, 7, 5};
            int[] secondArray = {8, 4, 2, 4};
            int[] res=mergeAndSort(firstArray,secondArray);
            Arrays.sort(res);
            System.out.print(Arrays.toString(res));
        }
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
            int[]result=new int[firstArray.length+secondArray.length];

            System.arraycopy(firstArray, 0, result, 0, firstArray.length);
            System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);

            return result;
    }
    }

