package Sorting;

import java.util.Arrays;

public class BubbleSort {


    //Performing the bubble sort
    static void bubble_sort_Func(int[] arr, int n) {

        //Prottekta element r Iteration korar jonno loop
        for (int i = 0; i < n - 1; i++) {

            //Loop to compare next elements with next's
            for (int j = 0; j < n - 1 - i; j++) {

                //2ta সংলগ্ন element r sathe compare
                // change > to < to sort in descending order

                if (arr[j] > arr[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {

        int[] nodes = {9,10,11,12,1, 2, 3,4,5,6,7,8};
        int n = nodes.length;

        bubble_sort_Func(nodes,n);

        System.out.println(Arrays.toString(nodes));
    }
}
