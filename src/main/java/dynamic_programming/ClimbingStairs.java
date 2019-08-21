package dynamic_programming;

/**
 * 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 * created by liangqun on 2019/8/21
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[n - 2];
        }
        return dp[n];
    }
}
