package task1to500.task1to100.task50to75;

public class Task53 {

    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     * A subarray is a contiguous part of an array.
     * <p>
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     * <p>
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     * <p>
     * Example 3:
     * Input: nums = [5,4,-1,7,8]
     * Output: 23
     */

    public int maxSubArray(int[] nums) {
        int count = 0;
        int result = 0;
        int min = Integer.MIN_VALUE;

        for (int num : nums) {
            count += num;
            if (count < 0) {
                count = 0;
            }

            if (result < count) {
                result = count;
            }
            if (min < num) {
                min = num;
            }
        }
        if (result == 0) {
            result = min;

        }

        return result;
    }

    public int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            max = Math.max(sum, max);

            if (sum < 0) sum = 0;
        }
        return max;
    }
}
