package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * created by liangqun on 2019/2/27
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            int sum = -nums[i];

            while (j < k) {
                if (nums[j] + nums[k] == sum) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) { j++; }
                    while (j < k && nums[k] == nums[k - 1]) { k--; }
                    j++;k--;
                } else if (nums[j] + nums[k] < sum) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4, -2, 3, 3};
        System.out.println(threeSum(nums));
    }
}
