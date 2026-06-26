class Solution {
        List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[candidates.length];

        backtrack(candidates, target, path, 0, used);
        return ans;
    }
    void backtrack(int[] candidates, int target, List<Integer> path, int start, boolean[] used){
        if(target == 0){
            ans.add(new ArrayList<>(path));
            return;
        }
        if(target<0){
            return;
        }
        for(int i = start; i<candidates.length; i++){
            if(i>start && candidates[i] ==  candidates[i-1] ) continue;
            used[i] = true;
            path.add(candidates[i]);
            backtrack(candidates, target-candidates[i], path, i+1, used);
            path.remove(path.size()-1);
            used[i] = false;
        }
    }
}