class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i =0; i<nums.length; i++){
            sum += nums[i];
        }
        if(Math.abs(target) > sum || (sum + target)%2 != 0) return 0;
        int tot = (sum+target)/2;
        int n = nums.length;
        int[][] dp = new int[n+1][tot+1];
        for(int i =0; i<= n; i++){
            dp[i][0] = 1;

        }
        for(int i = 1; i<= n; i++){
            for(int j =0; j<= tot; j++){
                if(nums[i-1]<= j){
                    dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j];

                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][tot];
        
    }
    
}