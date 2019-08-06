package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * 141
 * https://leetcode.com/problems/linked-list-cycle/
 * created by liangqun on 2019/7/24
 */
public class LinkedListCycle {

    public class Solution {


        /**
         * Two Pointers
         * @param head
         * @return
         */
        public boolean hasCycle(ListNode head) {
            if(head == null || head.next == null){
                return false;
            }

            ListNode slow = head;
            ListNode fast = head.next;
            while(slow != fast){
                if(fast == null || fast.next == null){
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }


        /**
         * Hash Table
         * @param head
         * @return
         */
        public boolean hasCycleV2(ListNode head) {
            Set<ListNode> nodesSeen = new HashSet<ListNode>();
            while (head != null) {
                if (nodesSeen.contains(head)) {
                    return true;
                } else {
                    nodesSeen.add(head);
                }
                head = head.next;
            }
            return false;
        }

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
