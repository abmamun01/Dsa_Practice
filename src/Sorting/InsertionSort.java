package Sorting;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSortFunc(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Temp jeta te value store korbo karon atar jaygay shift korbo atar ager(Left) r value k
            int temp = arr[i];

            int j = i - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].

            //Ager(Left) r sathe Right r compare
            while (j >= 0 && temp < arr[j]) {

                //arr[i] likha jay : arr[j] = arr[i-1]
                arr[j + 1] = arr[j];
                --j;
            }

            // I =2 , j=0 // temp=1 , arry[j]idx=1 = 5

            //Place key at after the element just smaller than it.
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {9, 5, 1, 4, 3};

        insertionSortFunc(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
