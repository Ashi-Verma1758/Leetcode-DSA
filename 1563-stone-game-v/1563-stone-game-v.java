class Solution {
    int[][] dp;
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[] prefix = new int[n];
        for(int i = 1; i<n; i++){
            prefix[i] = prefix[i-1]+stoneValue[i-1];
        }
        dp = new int[n][n];
        for(int i = n-2; i>=0; i--){
            for(int len = 1; len<n-i; len++){
                int j = i+len;
                int maxVal = 0;
                for(int k = i; k<j; k++){
                    int p1 = prefix[k] -prefix[i]+stoneValue[k];
                    int p2 = prefix[j] -prefix[k+1]+stoneValue[j];
                    if(p1<= p2){
                        maxVal = Math.max(maxVal, p1+dp[i][k]);
                    }
                    if(p1>= p2){
                        maxVal = Math.max(maxVal, p2+dp[k+1][j]);

                    }

                }
                dp[i][j] = maxVal;
            }
        }
        return dp[0][n-1];

    }
}