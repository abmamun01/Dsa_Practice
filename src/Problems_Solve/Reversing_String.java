package Problems_Solve;

import java.util.Arrays;

public class Reversing_String {



    static void reverseString(char[] arr) {
        int n = arr.length - 1;
        int start = 0;
        int end = n;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

    }

    public static void main(String[] args) {

        char[] arr = {'c', 'h', 'a', 'r'};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
}
