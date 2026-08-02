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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder path = new StringBuilder();
        StringBuilder start = new StringBuilder();
        StringBuilder dest = new StringBuilder();

      find(root, startValue, start);
      find(root, destValue, dest);
      int i =0;
      while(i<start.length()&& i<dest.length() && start.charAt(i) == dest.charAt(i)){
        i++;
      }
      StringBuilder ans = new StringBuilder();
      for(int j = i; j<start.length(); j++){
        ans.append('U');
      }
      ans.append(dest.substring(i));
      return ans.toString();
        
    }
    boolean find(TreeNode node, int target, StringBuilder path){
        if(node == null) return false;
        if(node.val == target ) return true;
                path.append('L');

        if(find(node.left, target, path)){
            return true;
        }
        path.deleteCharAt(path.length() - 1);
        path.append('R');
        if(find(node.right, target, path)){
            return true;
        }
        path.deleteCharAt(path.length() - 1);
        return false;
    }
}