package Exercises;

import java.util.Arrays;

public class HeapSort {

    static void heapSort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 + 1; i >= 0; i--) {
            heapify(arr, n, i);
        }


        for (int i = n - 1; i >= 0; i--) {


            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            
            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int n, int i) {


        int largeNode = i;
        int leftNode = 2 * i + 1;
        int rightNode = 2 * i + 2;

        if (leftNode < n && arr[leftNode] > arr[largeNode]) {
            largeNode =leftNode;

        }

        if (rightNode < n && arr[rightNode] > arr[largeNode]) {
            largeNode = rightNode;


        }
        if (largeNode != i) {
            int temp = arr[i];
            arr[i] = arr[largeNode];
            arr[largeNode] = temp;

            heapify(arr, n, i);
        }
    }

    public static void main(String[] args) {


        int arr[] = {1, 12, 2, 9, 5, 6, 10};

        heapSort(arr);
        System.out.println("Sorted array is " + Arrays.toString(arr));

    }
}
