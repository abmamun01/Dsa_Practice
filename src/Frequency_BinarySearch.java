import java.lang.reflect.Array;

public class Frequency_BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 17};
        int n = arr.length;

        System.out.println(binaryMethod(arr, 11));
    }


    static int binaryMethod(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;


        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                ans = arr[mid];
                return mid;

            }
            if (key < arr[mid]) {
                end = mid - 1;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            }
        }

        return ans;
    }


}
