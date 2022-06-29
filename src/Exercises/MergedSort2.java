package Exercises;

import java.util.Arrays;

public class MergedSort2 {


    static void divide(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }


        int mid = start + (end - start) / 2;


        divide(arr, start, mid);

        divide(arr, mid + 1, end);

        conquerTheM(arr, start, mid, end);
    }

    private static void conquerTheM(int[] arr, int start, int mid, int end) {

        int[] mergedArray = new int[end - start + 1];

        int idx1 = start;
        int idx2 = mid + 1;

        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                mergedArray[x++] = arr[idx1++];
            } else {
                mergedArray[x++] = arr[idx2++];
            }
        }


        while (idx1 <= mid) {
            mergedArray[x++] = arr[idx1++];

        }


        while (idx2 <= end) {
            mergedArray[x++] = arr[idx2++];

        }


        for (int i = 0, j = start; i < mergedArray.length; i++, j++) {
          arr[j]=mergedArray[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 7, 6, 9, 8, 5};
        int n = arr.length;

        divide(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
