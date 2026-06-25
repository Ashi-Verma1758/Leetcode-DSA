class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        Backtrack(ans, new ArrayList<>(), nums);
        return ans;
    }
    void Backtrack(List<List<Integer>> ans, List<Integer> path, int[] nums){
        if(path.size() == nums.length){
            ans.add(new ArrayList<>(path));
        }
        else{
            for(int i =0; i<nums.length; i++){
                if(path.contains(nums[i])) continue;
                path.add(nums[i]);
                Backtrack(ans, path, nums);
                path.remove(path.size()-1);
            }
        }
    }
}