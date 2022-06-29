package Exercises;

import java.util.Arrays;

public class Sort_using_quickSort {


    public static void quckSortFunc(int[] arr, int low, int high) {

        if (low < high) {

            int pivotXIdx = partition(arr, low, high);


            quckSortFunc(arr, low, pivotXIdx - 1);


            quckSortFunc(arr, pivotXIdx + 1, high);


        }


    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        i++;

        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;


        return i;

    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 7, 6, 9, 8, 5};
        int n = arr.length;
        quckSortFunc(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));
    }
}
