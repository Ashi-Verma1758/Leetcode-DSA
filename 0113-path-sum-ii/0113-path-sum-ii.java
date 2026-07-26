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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> output = new ArrayList<>();
        dfs(root, targetSum, 0, output, new ArrayList<>());
        return output;
    }
    void dfs(TreeNode root, int targetSum,int cursum, List<List<Integer>> output, List<Integer> currpath){
        if(root == null) return;
        cursum += root.val;
        currpath.add(root.val);
        if (root.left == null && root.right == null && cursum == targetSum) {
            output.add(new ArrayList<>(currpath));
        }

        // Recur for children
        dfs(root.left, targetSum, cursum, output, currpath);
        dfs(root.right, targetSum, cursum, output, currpath);

        currpath.remove(currpath.size() - 1);
    }
}