package bit;

import java.util.Arrays;

/**
 * 338. Counting Bits
 * https://leetcode.com/problems/counting-bits
 * created by liangqun on 2019/8/9
 */
public class CountBits {

    public static int[] countBits(int num) {
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++) {
            f[i] = f[i >> 1] + (i & 1);
        }
        return f;
    }

    public static void main(String[] args) {
        Arrays.stream(countBits(5)).forEach(System.out::println);
    }
}
