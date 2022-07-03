package Sorting;

import java.util.Arrays;

public class SelectionSort {


    static void selectionSortFunc(int[] arr, int n) {

        int temp;

        //first idx r element k min dhore nibo
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            //prottekta i r jonno puro loop akbar kore n songkhok bar run korbo
            //orthat:6,5,4,3,2,1 akhane first idx ye 6 ache tai i[0]=6<i[1]=5 boro na tai i[1] hoye jab min avabe colte
            //4hobe min 2,hobe min,1hobe min tarpor looop theke beriye jabe karon r nai
            for (int j = i + 1; j < n; j++) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // put min at the correct position
            // suppose min sobar last r sobar first hoiche sobcey boro songkha ta: 6,5,4,3,2,1
            // akhon 1 k first idx orthat 6 r jaygay swap korbe avabe e prottekta element swap hobe
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
