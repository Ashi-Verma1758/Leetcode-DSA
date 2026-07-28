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
    public int minimumOperations(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        bfsHelper(root, ans);
        int res = 0;
        for(List<Integer> ll : ans){
            res += minSwap(ll);
        }
        return res;
    }
    void bfsHelper(TreeNode root, List<List<Integer>> ans){
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> ll = new ArrayList<>();
            while(n-- >0){
                TreeNode rv = q.poll();
                ll.add(rv.val);
                if(rv.left != null){
                    q.add(rv.left);
                }
                if(rv.right != null){
                    q.add(rv.right);
                }
            }
            ans.add(ll);
        }
    }
    int minSwap(List<Integer> ll){
        int n = ll.size();
        int[][] arr = new int[n][2];
        for(int i =0; i<n; i++){
            arr[i][0] = ll.get(i);
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a,b) -> a[0]-b[0]);
        int swap = 0;
        boolean[] vis = new boolean[n];
        for(int i =0; i<n; i++){
            if(vis[i] || arr[i][1] == i){
                continue;
            }
            int cycle = 0;
            int j =i;
            while(!vis[j]){
                vis[j] = true;
                j = arr[j][1];
                cycle++;
            }
            swap+= cycle -1;
        }
        return swap;
    }
}