package tree;

/**
 * 230
 * Kth Smallest Element in a BST
 * created by liangqun on 2019/7/31
 */
public class KthSmallestElementInBST {

    int count = 0;
    int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }

    private void traverse(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        traverse(root.left, k);
        count++;
        if (count == k) {
            result = root.val;
        }
        traverse(root.right, k);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }
}
