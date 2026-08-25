package Glava_1.Task_1_18;

public class Pos {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 3, 7, 5};
        int[] secondArray = new int[]{8, 4, 2, 4};
        int[] result = mergeAndSort(firstArray, secondArray);
        int kol = 0;
        for (int j : result) {
            if (kol != 0) {
                System.out.print(",");
            }
            System.out.print(j);
            kol = 1;
        }
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int f = 0;
        int[] result = new int[firstArray.length + secondArray.length];
        for (int value : firstArray) {
            result[f++] = value;
        }
        for (int value : secondArray) {
            result[f++] = value;
        }
        for (int k = 0; k < result.length; k++) {
            for (int n = 0; n < result.length - k - 1; n++) {
                if (result[n + 1] < result[n]) {
                    int res = result[n];
                    result[n] = result[n + 1];
                    result[n + 1] = res;
                }
            }
        }
        return result;
    }
}
