class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int first =0;
        int sec = nums[n-1];
        int curr =0;
        for(int i = n-2; i>=0; i--){
            int rob = nums[i] + first;
            int skip = sec;
            curr = Math.max(rob, skip);
            first = sec;
            sec =curr;
        }
        return curr;
    }
    
}