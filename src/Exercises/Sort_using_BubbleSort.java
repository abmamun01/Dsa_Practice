package Exercises;

import java.util.Arrays;

public class Sort_using_BubbleSort {


    static void bubbleFunc(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 7, 6, 9, 8, 5};
        bubbleFunc(arr);

        System.out.println(Arrays.toString(arr));

    }
}
