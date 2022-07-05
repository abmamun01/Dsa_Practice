package Problems_Solve;

import java.util.Arrays;

public class Max_Min_Of_an_array {

    static class Pair {
        int min;
        int max;
    }

    static Pair max_min(int[] arr) {
        Pair minmax = new Pair();
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }

        return minmax;

    }


    public static void main(String[] args) {

        int[] arr = {1,10,6, 3, 9, 5, 2, 8};
        Pair minmax = max_min(arr);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);

    }
}
