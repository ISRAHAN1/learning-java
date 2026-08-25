package Glava_1.Task_1_5_7_;

public class SlM {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 3, 7, 5};
        int[] secondArray = new int[]{8, 4, 2, 4};

        int[] a = mergeAndSort(firstArray, secondArray);
        int res = 0;
        for (int element : a) {
            if (res != 0)
                System.out.print(",");
            System.out.print(element);
            res = 1;
        }
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int f = 0;
        int[] result = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            result[f++] = firstArray[i];
        }
        for (int j = 0; j < secondArray.length; j++) {
            result[f++] = secondArray[j];
        }
        for (int c = 0; c < result.length; c++) {
            for (int k = 0; k < result.length - c - 1; k++) {
                if (result[k + 1] < result[k]) {
                    int n = result[k];
                    result[k] = result[k + 1];
                    result[k + 1] = n;
                }
            }
        }
        return result;
    }
}

