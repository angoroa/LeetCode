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
        int MAX = sol(root,0);
        return MAX;
    }
    public int sol(TreeNode Node, int depth){
        if (Node == null) return depth;
        return Math.max(sol(Node.left, depth+1), sol(Node.right, depth+1));
    }
}