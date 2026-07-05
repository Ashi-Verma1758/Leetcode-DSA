class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        int ceil = nums.length/3;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int ele = entry.getKey();
            int cnt = entry.getValue();
            if(cnt> ceil){
                ans.add(ele);
            }
        }
        return ans;
    }
}