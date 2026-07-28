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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            List<Integer> ll = new ArrayList<>();
            int n = q.size();
            for(int i =0; i<n; i++){
            TreeNode rv = q.poll();

                ll.add(rv.val);
                 if(rv.left!= null) {
                q.add(rv.left);
                 }
                if(rv.right!= null) {
                q.add(rv.right);
            }

            }
            ans.add(0,ll);
            
        }
        return ans;
    }
}