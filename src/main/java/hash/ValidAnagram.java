package hash;

/**
 * 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 * created by liangqun on 2019/8/1
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[s.charAt(i) - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
