/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean ib = true;
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = 0;
        int rh = 0;
        if (root.left != null) {
            lh =  1 + height(root.left);
        }
        if (root.right != null) {
            rh = 1 + height(root.right);
        }
        if (Math.abs(lh - rh) > 1) {
            ib = false;
        }
        return Math.max(lh, rh);

    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int lh = 0;
        int rh = 0;
        if (root.left != null) {
            lh = 1 + height(root.left);
        }
        if (root.right != null) {
            rh = 1 + height(root.right);
        }
        return (Math.abs(lh - rh) <= 1) && ib;
    }
}
