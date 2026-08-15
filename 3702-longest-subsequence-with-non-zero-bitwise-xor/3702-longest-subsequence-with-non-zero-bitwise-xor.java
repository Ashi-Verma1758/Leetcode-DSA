class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        boolean hasTrue = false;
        for(int i = 0; i<nums.length; i++){
            ans ^= nums[i];
            if(nums[i] != 0) hasTrue = true;

        }
        if(!hasTrue ){
            return 0;
        }
        if(ans!= 0) return nums.length;
        return nums.length-1;
        
    }
}