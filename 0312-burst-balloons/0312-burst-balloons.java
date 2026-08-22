    class Solution {
        public int maxCoins(int[] nums) {
            int n = nums.length;
            int[] arr = new int[n+2];
            arr[0] =  1;
            arr[n+1] = 1;
            for(int i =1; i<n+1; i++){
                arr[i] = nums[i-1];
            }
            int[][] dp = new int[n+2][n+2];
            for(int wind = 1; wind<=n; wind++){
                for(int left = 1; left<=n-wind+1; left++){
                    int right = left+wind -1;
                    for(int i = left; i<=right; i++){
                        dp[left][right] = Math.max(dp[left][right], dp[left][i-1]+ 
                        dp[i+1][right] + arr[left-1]*arr[i]*arr[right+1]);
                    }
                }
            }
            return dp[1][n];
        }
    }