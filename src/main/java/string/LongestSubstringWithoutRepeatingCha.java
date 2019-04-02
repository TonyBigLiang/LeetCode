package string;

import java.util.HashSet;
import java.util.Set;

/**
 * 3.Longest Substring Without Repeating Characters
 * created by liangqun on 2019/4/2
 */
public class LongestSubstringWithoutRepeatingCha {

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcb"));
    }
}
