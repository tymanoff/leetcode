package task1to500.task1to100.task1to25;

import java.util.*;

public class Task1 {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * <p>
     * Constraints:
     * <p>
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * Only one valid answer exists.
     * <p>
     * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     */

    public static void main(String[] args) {
        int[] array = {3, 4, 2, 7};
        int[] array1 = {4, 4, 4, 1, 3, 2, 5};
        int[] array2 = {2, 7, 11, 15};
        int[] array3 = {3, 3};
        searchStream(array, 6);
        searchStream(array1, 6);
        searchStream(array2, 9);
        searchStream(array3, 6);
    }

    public static int[] searchStream(int[] nums, int target) {
        Map<Integer, List<Integer>> numbers = new HashMap<>();

        int i = 0;
        for (Integer numb : nums) {
            if (numbers.containsKey(numb) && numbers.get(numb).size() < 3) {
                numbers.get(numb).add(i);
            }
            if (numbers.get(numb) == null) {
                numbers.put(numb, new ArrayList<>());
                numbers.get(numb).add(i);
            }
            i++;
        }

        for (Integer numb : nums) {
            int incr = target - numb;
            if (numbers.containsKey(incr)) {
                if (numb != incr) {
                    return new int[]{numbers.get(numb).get(0), numbers.get(incr).get(0)};
                }
                if (numbers.get(incr).size() > 1) {
                    return new int[]{numbers.get(incr).get(0), numbers.get(incr).get(1)};
                }
            }
        }

        return new int[0];
    }
}
