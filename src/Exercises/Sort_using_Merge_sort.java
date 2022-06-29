package Exercises;

import java.util.Arrays;

public class Sort_using_Merge_sort {

    static void divide(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        divide(arr, start, mid);

        divide(arr, mid + 1, end);

        conquerFunc(arr, start, mid, end);



    }

    private static void conquerFunc(int[] arr, int start, int mid, int end) {

        int[] mergedArray = new int[end-start+1];

        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                mergedArray[x++] = idx1++;
            } else {
                mergedArray[x++] = arr[idx2++];
            }

        }


        while (idx1 <= mid) {
            mergedArray[x++] = arr[idx1++];
        }

        while (idx2 <= end) {
            mergedArray[x++] = idx2++;
        }

        for (int i = 0, j = start; i < mergedArray.length; j++, i++) {
            arr[j]=mergedArray[i];
        }
    }

    public static void main(String[] args) {

        int[] nodes = {9, 10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8};
        int n = nodes.length;

        divide(nodes, 0, n - 1);

       System.out.println(Arrays.toString(nodes));
    }
}
