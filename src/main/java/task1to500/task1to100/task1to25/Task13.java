package task1to500.task1to100.task1to25;

import java.util.HashMap;
import java.util.Map;

public class Task13 {

    /**
     *Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     *<p>
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     *<p>
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     *<p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     *<p>
     * Example 1:
     *<p>
     * Input: s = "III"
     * Output: 3
     * Explanation: III = 3.
     * Example 2:
     *<p>
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     * Example 3:
     *<p>
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     *<p>
     * Constraints:
     *<p>
     * 1 <= s.length <= 15
     * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
     * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
     * */

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> symbolMeaning = new HashMap<>();
        symbolMeaning.put('I', 1);
        symbolMeaning.put('V', 2);
        symbolMeaning.put('X', 3);
        symbolMeaning.put('L', 4);
        symbolMeaning.put('C', 5);
        symbolMeaning.put('D', 6);
        symbolMeaning.put('M', 7);
        Map<Character, Integer> symbolMap = new HashMap<>();
        symbolMap.put('I', 1);
        symbolMap.put('V', 5);
        symbolMap.put('X', 10);
        symbolMap.put('L', 50);
        symbolMap.put('C', 100);
        symbolMap.put('D', 500);
        symbolMap.put('M', 1000);
        for (int i = s.length() - 1; i >= 0; i--) {
            if(i > 0 && symbolMeaning.get(s.charAt(i)) > symbolMeaning.get(s.charAt(i - 1))){
                result += symbolMap.get(s.charAt(i)) - symbolMap.get(s.charAt(i - 1));
                i--;
                continue;
            }
            result += symbolMap.get(s.charAt(i));
        }
        return result;
    }
}
