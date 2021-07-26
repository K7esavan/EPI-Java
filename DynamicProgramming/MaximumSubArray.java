public class MaximumSubArray {

    static int getMaximulSumOfSubArray(int arr[]) {

        int sum = 0, minSum = 0, maxSum = 0;

        for(int val : arr) {
            sum  += val;

            if (sum < minSum) {
                minSum = sum; // it occurs when there are negative elements in array
            }

            if (sum - minSum > maxSum) {
                maxSum = sum - minSum;
            }
        }

        return maxSum;
    }
}
