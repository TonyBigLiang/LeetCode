package string;

/**
 * 5. Longest Palindromic Substring
 * created by liangqun on 2019/4/2
 */
public class LongestPalindromicSubstring {

    private static int lo, maxLen;

    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }
        return s.substring(lo, lo + maxLen);
    }

    private static void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j+1;
            maxLen = k - j - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
        String str = "flower";
        System.out.println(str.indexOf("flight"));
    }
}
