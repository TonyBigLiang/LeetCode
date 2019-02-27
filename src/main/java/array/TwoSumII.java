package array;

/**
 * created by liangqun on 2019/2/25
 */
public class TwoSumII {

    public static int[] twoSum(int[] num, int target) {
        int[] indict = new int[2];
        if (num == null || num.length < 2) {
            return indict;
        }

        int left = 0;
        int right = num.length - 1;
        while (left < right) {
            int v = num[left] + num[right];
            if (v == target) {
                indict[0] = left + 1;
                indict[1] = right + 1;
                break;
            } else if (v > target) {
                right--;
            } else {
                left++;
            }
        }
        return indict;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int[] result = twoSum(arr, 9);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
