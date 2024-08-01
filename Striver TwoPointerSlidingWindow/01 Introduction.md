# Sliding Window / Two Pointers
- 1. Constant Window [Eg. 1] 
  - Its will not asked lot of time in big company but good to know.
- 2. Longest Subarray/Substring [Eg. 2]
  - Its very very important in array as well as strings
## 1. Find the maximum sum of the subarray.
- Using Sliding Window to find the Maximum sum of the array.
```java
    public class SlidingWindowExample {
    public static int maxSumSubarray(int[] nums, int k) {
        int maxSum = 0,windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        // Assume the first window has the maximum sum
        maxSum = windowSum;

        // Sliding the window
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            // Update the maximum sum
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int result = maxSumSubarray(nums, k);
        System.out.println("Maximum Sum of Subarray of Size " + k + ": " + result);
    }
}

```

## 2. Longest Subarray with sum <= K
- arr


- `Brute Force` : Generate all subarray 