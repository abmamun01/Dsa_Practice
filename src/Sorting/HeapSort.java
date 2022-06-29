package Sorting;

import java.util.Arrays;

public class HeapSort {


    static void sortingHeap(int[] arr) {
        int n = arr.length;

        //Build Max Heap
        // suru hobe n/2 theke karon "(n/2)+1) theke leaf node suru hoy
        // Leaf node r child nai tai atai aka akta Heap

        for (int i = n / 2 - 1; i >= 0; i--) {

            // ai function r kaj shudu parent node child node theke
            //boro rakha sort kora na
            heapifyFunc(arr, n, i);
        }

        //Heap sort
        /**
         * akhane root node delete operation korbo and loop r maddome
         * arr r last index ye root element bosabo ak akbar loop r maddome
         */
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;


            /**
             abar heap call korbo and atar heap node 0idx ye and sei onujayi sort
             korbo karon 0idx e ja chilo ta last idx ye cole geche to new vabe
             abar max heap call korte hobe abave colte thakbe until end
             */
            //Heapify root element :
             heapifyFunc(arr, i, 0);
        }
    }

    private static void heapifyFunc(int[] arr, int n, int i) {

        //Find largest_parent among root, left child and right child
        //Assuming "i" as larger
        int largeNode = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

         if (l < n && arr[l] > arr[largeNode]) {
            largeNode = l;

        }

        if (r < n && arr[r] > arr[largeNode]) {
            largeNode = r;


        }

        //Swap and continue heapifying if root is not largest_parent
        if (largeNode != i) {
            int swap = arr[i];
            arr[i] = arr[largeNode];
            arr[largeNode] = swap;



            heapifyFunc(arr, n, largeNode);
        }
    }


    public static void main(String[] args) {

        int arr[] = {1, 12, 2, 9, 5, 6, 10};

        sortingHeap(arr);
        System.out.println("Sorted array is " + Arrays.toString(arr));

    }
}
