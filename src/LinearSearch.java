public class LinearSearch {

    static int linearSearch(int arr[], int n, int x) {
        int i;

        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Found Number: " + arr[i]);
                return i;
            }
        }

        i = -1;
        return -1;
    }

    public static void main(String[] args) {

        int[] nodes = {1, 2, 4, 66, 76, 5, 7, 45, 3, 65, 85, 23, 53};
        int n = nodes.length;
        System.out.println(linearSearch(nodes, n, 66));
    }
}
