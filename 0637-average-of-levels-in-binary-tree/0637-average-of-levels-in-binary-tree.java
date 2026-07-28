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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
        long sum = 0;

            for(int i = 0; i<n; i++ ){
            TreeNode rv = q.poll();
            sum += rv.val;


            if(rv.left != null){
                q.add(rv.left);
            }
            if(rv.right != null){
                q.add(rv.right);
            }
        }
            ans.add((double)sum/n);
        
    }
        return ans;

    
}
}
 