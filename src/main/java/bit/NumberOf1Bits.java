package bit;

/**
 * 191. Number of 1 Bits
 * https://leetcode.com/problems/number-of-1-bits/
 * created by liangqun on 2019/8/8
 */
public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            n &= (n-1);
            res++;
        }
        return res;
    }
}
