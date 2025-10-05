// KadaneAlgorithm.java
// Author: [Your Name]
// Topic: Dynamic Programming / Arrays
// Description: Find the maximum subarray sum using Kadane's Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

public class KadaneAlgorithm {

    // Function to find the maximum subarray sum
    public static int maxSubArraySum(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either add current element or start new subarray
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);

            // Update global maximum
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        return maxGlobal;
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
