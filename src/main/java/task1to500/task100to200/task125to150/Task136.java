package task1to500.task100to200.task125to150;

public class Task136 {

    /**
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     * You must implement a solution with a linear runtime complexity and use only constant extra space.
     */

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int val : nums) {
            res = res ^ val;
        }
        return res;
    }
}
