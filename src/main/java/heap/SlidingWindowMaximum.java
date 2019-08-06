package heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 239. Sliding Window Maximum
 * https://leetcode.com/problems/sliding-window-maximum/
 * created by liangqun on 2019/8/1
 */
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] res = new int[nums.length + 1 - k];
        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                pq.remove(nums[i - k]);
            }
            pq.offer(nums[i]);
            if (i + 1 >= k) {
                res[i + 1 - k] = pq.peek();
            }
        }
        return res;
    }
}
