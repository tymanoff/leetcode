package task1to500.task100to200.task150to175;

import java.math.BigInteger;

public class Task172 {

    /**
     * Given an integer n, return the number of trailing zeroes in n!.
     * Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
     * <p>
     * Example 1:
     * Input: n = 3
     * Output: 0
     * Explanation: 3! = 6, no trailing zero.
     * <p>
     * Example 2:
     * Input: n = 5
     * Output: 1
     * Explanation: 5! = 120, one trailing zero.
     * <p>
     * Example 3:
     * Input: n = 0
     * Output: 0
     * */

    public int trailingZeroes(int n) {
        int result = 0;
        int i = 5;
        while ((n / i) > 0) {
            result = result + n / i;
            i = i * 5;
        }

        return result;
    }

    // Status: Time Limit Exceeded
    public int trailingZeroes2(int n) {
        int result = 0;

        BigInteger count = getFactorial(BigInteger.valueOf(n));

        BigInteger ten = BigInteger.valueOf(10);
        while (count.remainder(ten).equals(BigInteger.ZERO)){
            count = count.divide(ten);
            result++;
        }

        return result;
    }

    public BigInteger getFactorial(BigInteger num) {
        if (num.intValue() == 0) return BigInteger.valueOf(1);
        if (num.intValue() == 1) return BigInteger.valueOf(1);
        return num.multiply(getFactorial(num.subtract(BigInteger.valueOf(1))));
    }
}
