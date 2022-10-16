package task1to500.task1to100.task1to25;

public class Task7 {

    /**
     * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     * <p>
     * Example 1:
     * <p>
     * Input: x = 123
     * Output: 321
     * <p>
     * Example 2:
     * <p>
     * Input: x = -123
     * Output: -321
     * <p>
     * Example 3:
     * <p>
     * Input: x = 120
     * Output: 21
     * */

    public int reverse(int x) {
        StringBuilder reverseNumbers = new StringBuilder(String.valueOf(x)).reverse();
        int result = 0;
        if (x >= 0){
            String stringNumbers = reverseNumbers.toString();
            if(Long.parseLong(stringNumbers) >= Integer.MAX_VALUE){
                return result;
            } else {
                return Integer.parseInt(stringNumbers);
            }
        } else {
            String stringNumbers = reverseNumbers.substring(0,String.valueOf(x).length() - 1);
            if ((Long.parseLong(stringNumbers) * -1) <= Integer.MIN_VALUE) {
                return result;
            } else {
                return Integer.parseInt(stringNumbers) * -1;
            }
        }
    }
}
