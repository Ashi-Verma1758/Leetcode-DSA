class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> path = new ArrayList<>();
        backtrack(ans, path, n , k, 1);
        return ans;
    }
    void backtrack(List<List<Integer>> ans, List<Integer> path, int n, int k, int start){
        if(k == 0){
            ans.add(new ArrayList<>(path));
            return;
        }
        else{
            
            for(int i = start; i<=n; i++){
                path.add(i);
                backtrack(ans, path, n, k-1, i+1);
                path.remove(path.size()-1);
            }
        }
    }
}