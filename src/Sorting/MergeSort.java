package Sorting;

import java.util.Arrays;

public class MergeSort {

    static void conquerFunc(int[] arr, int start, int mid, int end) {

        // For new memory location create new array , atar length start theke end porjonto hobe
        int[] merged = new int[end - start + 1];


        int idx1 = start;

        // 2nd part start point
        int idx2 = mid + 1;
        //Array r pointer track korar jonno x
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;

            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;

            }
        }


        /** =
         * jehetu aikhane 2 part ye vag hocce amon
         * hote pare j 1 ta array boro , tahole akta sompurno sesh hole o
         * arekta baki thake seta complete korar jonno arekta loop lagbe
         */

        while (idx1 <= mid) {
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }

        while (idx2 <= end) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }


        // akhon original array r modde merged r element gula k copy korte hobe
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }


    public static void divide(int[] arr, int start, int end) {

        //Jodi amon hoy j start idx "ending idx theke boro hoy tahole
        if (start >= end) {
            return;
        }
        //Calculating Mid
        int mid = start + (end - start) / 2;

        // 1st part divided in array
        divide(arr, start, mid);

        //2nd part divided in array
        divide(arr, mid + 1, end);

        // Now Conquer func start
        conquerFunc(arr, start, mid, end);
    }

    public static void main(String[] args) {


        int[] nodes = {9, 10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8};
        int n = nodes.length;

        divide(nodes, 0, n - 1);

        System.out.println(Arrays.toString(nodes));
    }
}
