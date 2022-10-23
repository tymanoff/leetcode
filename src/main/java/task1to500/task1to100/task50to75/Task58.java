package task1to500.task1to100.task50to75;

public class Task58 {

    /**
     * Given a string s consisting of words and spaces, return the length of the last word in the string.
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example 1:
     * <p>
     * Input: s = "Hello World"
     * Output: 5
     * Explanation: The last word is "World" with length 5.
     * <p>
     * Example 2:
     * <p>
     * Input: s = "   fly me   to   the moon  "
     * Output: 4
     * Explanation: The last word is "moon" with length 4.
     * <p>
     * Example 3:
     * <p>
     * Input: s = "luffy is still joyboy"
     * Output: 6
     * Explanation: The last word is "joyboy" with length 6.
     * */

    public int lengthOfLastWord(String s) {
        String[] stringArr = s.split(" ");
        return stringArr[stringArr.length-1].length();
    }
}
