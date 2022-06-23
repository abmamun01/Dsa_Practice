package Sorting;

import java.util.Arrays;

public class SelectionSort {


    static void selectionSortFunc(int[] arr, int n) {

        int temp;
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // put min at the correct position
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, 66, 76, 5, 7, 45, 3, 65, 85, 23, 53};
        int n = nodes.length;

        System.out.println("Before Sort " + "\n" + Arrays.toString(nodes));
        selectionSortFunc(nodes, n);
        System.out.println("Before Sort ");

        System.out.println(Arrays.toString(nodes));
    }
}
