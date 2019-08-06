package tree;

import entity.TreeNode;

import java.util.Stack;

/**
 * 98. Validate Binary Search Tree
 * https://leetcode.com/problems/validate-binary-search-tree/
 * created by liangqun on 2019/8/5
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST_V1(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }

        int val = node.val;
        if(lower != null && val <= lower) return false;
        if(upper != null && val >= upper) return false;

        if(!helper(node.right, val, upper)) return false;
        if(!helper(node.left, lower, val)) return false;

        return true;
    }

    //----------------------------------------------------------------
    public boolean isValidBST_V2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double inorder = -Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if(root.val <= inorder) return false;
            inorder = root.val;
            root = root.right;
        }
        return true;
    }


}
