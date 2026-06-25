class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, list, used);
        return ans;
    }
    void backtrack(int[] nums, List<Integer> path,boolean[] used){
        if(path.size() == nums.length){
            ans.add(new ArrayList<>(path));
        }
        else{
            for(int i = 0; i<nums.length; i++){
                if(i>0 && nums[i-1] == nums[i] && !used[i-1] || (used[i])) continue;
                used[i] = true;
                path.add(nums[i]);
                backtrack(nums, path, used);
                path.remove(path.size()-1);
                used[i] = false;
            }
        }
    }
}