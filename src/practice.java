import java.util.Arrays;

class practice {
    //merge//heap//bubble//quick sort//insertion//selection
    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {9, 10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8};
        int n = nodes.length;

        selectionSort(nodes);

        System.out.println(Arrays.toString(nodes));
    }
}