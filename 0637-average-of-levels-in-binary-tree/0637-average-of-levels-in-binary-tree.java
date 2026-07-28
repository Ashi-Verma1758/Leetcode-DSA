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
        List<List<Double>> res = new ArrayList<>();
        bfsHelper(root, res);
        for(List<Double> ll : res){
            ans.add(helper(ll));
        }
        return ans;
        
        
    }
    double helper(List<Double> ll){
        double sum = 0;
        for(int i=0; i<ll.size(); i++){
            sum += ll.get(i);

        }
        return sum/ll.size();
    }
    void bfsHelper(TreeNode root, List<List<Double>> res){
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Double> ll = new ArrayList<>();
            while(n-- > 0 ){
            TreeNode rv = q.poll();
            ll.add((double) rv.val);


                if(rv.left != null){
                q.add(rv.left);
            }
            if(rv.right != null){
                q.add(rv.right);
            }
            }
        res.add(ll);

        }
        
    }
}