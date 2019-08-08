package divide_conquer;

/**
 * 169.Majority Element
 * https://leetcode.com/problems/majority-element/
 * created by liangqun on 2019/8/7
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1};
        System.out.println(majorityElement(nums));
    }
}
