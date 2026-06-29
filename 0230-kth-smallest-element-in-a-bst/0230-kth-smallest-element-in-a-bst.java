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
        int count = 0;
        int num = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);

        return num;
    }
    void helper(TreeNode n){
        if(n.left != null) helper(n.left);
        count--;
        if(count == 0){
            num = n.val;
            return;
        }
        if(n.right != null) helper(n.right);
    }
}