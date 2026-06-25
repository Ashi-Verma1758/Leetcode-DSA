class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> path = new ArrayList<>();
        backtrack(path, nums, 0);
        return ans;
    }
    void backtrack(List<Integer> path, int[] nums, int start){
        if(path.size() >=2){
            ans.add(new ArrayList<>(path));
        }
            HashSet<Integer> used = new HashSet<>();
            for(int i = start; i<nums.length; i++){
                if(used.contains(nums[i])) continue;
                if(!path.isEmpty() && nums[i]<path.get(path.size()-1)) continue;
                used.add(nums[i]);
                path.add(nums[i]);
                backtrack(path, nums, i+1);
                path.remove(path.size()-1);
                
            }

        
    }
}