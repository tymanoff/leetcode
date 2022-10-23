package task1to500.task1to100.task25to50;

public class Task35 {

    /**
     * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     * You must write an algorithm with O(log n) runtime complexity.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [1,3,5,6], target = 2
     * Output: 1
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [1,3,5,6], target = 7
     * Output: 4
     */

    public int searchInsert(int[] nums, int target) {
        int mid = nums.length / 2;
        if (target == nums[mid]) {
            return mid;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
