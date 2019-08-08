package divide_conquer;

/**
 * 50. Pow(x, n)
 * https://leetcode.com/problems/powx-n/
 * created by liangqun on 2019/8/6
 */
public class Pow {

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
//        if (n % 2 == 0) {
        if ((n&1) == 0) {
            return myPow(x * x, n / 2);
        } else {
            return x * myPow(x * x, n / 2);
        }
    }

    public static double myPow_V2(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        double ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans *= x;
            }
            x *= x;
            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
//        System.out.println(Pow.myPow(2, 7));
        System.out.println(Pow.myPow_V2(2, 5));

    }
}
