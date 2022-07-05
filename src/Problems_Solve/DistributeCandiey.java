package Problems_Solve;

public class DistributeCandiey {

    static int chocolateDistribute(int[] arr, int m) {

        int n = arr.length;

        int minDiffer = Integer.MAX_VALUE;

        for (int i = 0; i < m - 1; i++) {

            int calculateDiffer = arr[i + m - 1] - arr[i];

            if (calculateDiffer < minDiffer) {
                minDiffer = calculateDiffer;
                return minDiffer;
            }
        }

        return minDiffer;

    }

    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23,
                25, 41, 30, 40, 28,
                42, 30, 44, 48, 43,
                50};

        int m = 7;  // Number of students

        int n = arr.length;
        System.out.println("Minimum difference is "
                + chocolateDistribute(arr, m));
    }
}
