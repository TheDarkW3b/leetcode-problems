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
    public int checkDepth(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = checkDepth(root.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkDepth(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(rightHeight - leftHeight) > 1) return -1;
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
    
    public boolean isBalanced(TreeNode root) {
        return checkDepth(root) != -1;
    }
}
