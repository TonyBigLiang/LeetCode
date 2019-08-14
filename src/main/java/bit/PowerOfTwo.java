package bit;

/**
 * 231
 * created by liangqun on 2019/8/8
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        return (n&(n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println((4&3) == 0);
    }
}
