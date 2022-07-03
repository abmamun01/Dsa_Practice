package Sorting;

import java.util.Arrays;

public class QuickSort {

    // method to find the partition position
    private static int partition(int[] arr, int low, int high) {

        // we choose PIVOT as last element of an array
        int pivot = arr[high];

        /** I r kaj hocce ata find kora j koto choto element asbe
         * amdr array r modde
         *
         * array r modde koto jayga khali howa dorkar jate amdr pivot r age
         * joto choto element tader jayga hoy
         */

        // Now we ar assuming amdr array te pivot theke choto r nei
        // pointer for greater element
        int i = low - 1;

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                //khali jayga track kortace "I"
                // if element smaller than pivot is found
                // swap it with the greatr element pointed by i
                i++;
                System.out.println(i+"  "+j);

                // swapping element at i with element at j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        //Pivot r jonno khai jayga lagbe tai I++
        // swap the pivot element with the greater element specified by i
        i++;
        int temp = arr[i];
        arr[i] = pivot;

        //Pivot r position
        arr[high] = temp;
        return i; //Pivot index || pivot position
    }


    public static void quickSortFunc(int[] arr, int low , int high) {

        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pivotIdx = partition(arr, low, high);

            /**2nd time call quick sort : jehetu already
             * 1st bar pivot paiya felchi tokhon 2 divide hoiche
             * pivot r age and pivot r pore
             *
             * akhon ai 2tar modde pivot khujar jonno  abar func call korbo
             * avabe e colte thakbe
             */


            //Pivot theke choto element r jonno (Left Side)
            // recursive call on the left of pivot
            quickSortFunc(arr, low, pivotIdx - 1);

            //Pivot theke boro  element r jonno (Right Side)
            // recursive call on the right of pivot
            quickSortFunc(arr, pivotIdx + 1, high);

        }

    }

    public static void main(String[] args) {

        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;

        quickSortFunc(arr, 0, n - 1);


        System.out.println(Arrays.toString(arr));
    }
}
