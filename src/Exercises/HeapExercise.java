package Exercises;

import java.util.Arrays;

public class HeapExercise {

    static void heapifyFunc(int[] arr, int array_size, int i) {


        int largeNode = i;
        int leftNode = 2 * i + 1;
        int rightNode = 2 * i + 2;

        if (leftNode < array_size && arr[leftNode] > arr[largeNode]) {
            largeNode = leftNode;
        }

        if (rightNode < array_size && arr[rightNode] > arr[largeNode]) {
            largeNode = rightNode;
        }

        if (largeNode != i) {
            int temp = arr[i];
            arr[i] = arr[largeNode];
            arr[largeNode] = temp;


            heapifyFunc(arr, array_size, largeNode);
        }
    }

    static void sortHeapify(int[] arr) {

        int n = arr.length;

        //Building max heap
        for (int i = n / 2 - 1; i >= 0; i--) {

            heapifyFunc(arr, n, i);
        }


        //sort
        for (int i = n - 1; i >= 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapifyFunc(arr, i, 0);
        }

    }

    public static void main(String[] args) {

        int arr[] = {1, 12, 2, 9, 5, 6, 10};

        sortHeapify(arr);
        System.out.println("Sorted array is EXERC" + Arrays.toString(arr));
    }
}
