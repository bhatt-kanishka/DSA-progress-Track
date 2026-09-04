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
    public int maxDepth(TreeNode root) {
        // Base Case: If the current node is null, its depth is 0
        if (root == null) {
            return 0;
        }
        
        // Recursive Calls: Find the maximum depth of both subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        // Combine: Take the larger depth and add 1 for the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
