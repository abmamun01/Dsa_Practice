package Problems_Solve;

public class MaxSum_subArray {
    public static int maxSubArray(int[] arr) {

/*
        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;

*/


/*
        int size = arr.length;
        int start = 0;
        int end = 0;

        int maxSoFar = arr[0], maxEndingHere = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > maxEndingHere + arr[i]) {
                start = i;
                maxEndingHere = arr[i];
            } else
                maxEndingHere = maxEndingHere + arr[i];

            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                end = i;
            }
        }
        System.out.println("Found Maximum Subarray between {} and {} " + end+"  "+start);
        return maxSoFar;*/


            int result = arr[0], minPrefixSum = Math.min(0, arr[0]), currPrefixSum = arr[0];
            for (int i = 1; i < arr.length; ++i) {
                currPrefixSum += arr[i];
                result = Math.max(result, currPrefixSum - minPrefixSum);
                minPrefixSum = Math.min(minPrefixSum, currPrefixSum);
            }
            return result;

    }

    public static void main(String[] args) {
        int arr[] = {-1};

        System.out.println(maxSubArray(arr));
    }
}
