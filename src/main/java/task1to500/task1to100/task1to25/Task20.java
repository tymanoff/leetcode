package task1to500.task1to100.task1to25;

import java.util.*;

public class Task20 {

    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * An input string is valid if:
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     * <p>
     * Example 1:
     * <p>
     * Input: s = "()"
     * Output: true
     * <p>
     * Example 2:
     * <p>
     * Input: s = "()[]{}"
     * Output: true
     * <p>
     * Example 3:
     * <p>
     * Input: s = "(]"
     * Output: false
     * <p>
     * Constraints:
     * 1 <= s.length <= 104
     * s consists of parentheses only '()[]{}'.
     */

    public static boolean isValid(String s) {
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                list.add(')');
                continue;
            }
            if (s.charAt(i) == '[') {
                list.add(']');
                continue;
            }
            if (s.charAt(i) == '{') {
                list.add('}');
                continue;
            }
            if (list.size() != 0) {
                if (list.get(list.size() - 1) == s.charAt(i)) {
                    list.remove(list.size() - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (!list.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isValid2(String s) {
        Stack<Character> st = new Stack<>();
        for (char a : s.toCharArray()) {
            //Check if stack not empty and the top element corresponds to curr char
            if (!st.isEmpty() && (st.peek() == a - 1 || st.peek() == a - 2))
                st.pop();
                //else these migh be starting brackets or unsatisfied closing brackets
            else
                st.push(a);
        }

        return st.isEmpty();
    }
}
