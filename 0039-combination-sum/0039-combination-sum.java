class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(new ArrayList<>(), candidates, target, 0);
        return result;
    }
    void backtrack(List<Integer> path, int[]nums, int target, int start){
        if(target == 0){
            result.add(new ArrayList<>(path));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start; i<nums.length; i++){
            path.add(nums[i]);
            backtrack(path, nums, target-nums[i], i);
            path.remove(path.size()-1);
        }
    }
}