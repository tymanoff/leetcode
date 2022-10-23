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
     */

    public int[] searchStream(int[] nums, int target) {
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
