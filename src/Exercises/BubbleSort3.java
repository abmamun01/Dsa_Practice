package Exercises;

import java.util.Arrays;

public class BubbleSort3 {

    static void sortBubbling(int[] arr) {

        int arr_size = arr.length;


        for (int i = 0; i < arr_size - 1; i++) {

            for (int j = 0; j < arr_size - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {


        int arr[] = {1, 12, 2, 9, 5, 6, 10};

        sortBubbling(arr);
        System.out.println("Sorted array is " + Arrays.toString(arr));

    }
}
