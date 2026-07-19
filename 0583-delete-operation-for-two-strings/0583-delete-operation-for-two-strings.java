class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if(m==0 || n==0) return m+n;
        
        int ans = m+n-2*(LCS(m, n, word1, word2));
        return ans;
    }
    int LCS(int m, int n, String word1, String word2){
        int dp[][] = new int[m][n];
        for(int i = 0; i<m; i++){
            if(word1.charAt(i) == word2.charAt(0))
            dp[i][0] = 1;
            else if(i!=0){
                dp[i][0] = dp[i-1][0];
            }

        }
        for(int i = 0; i<n; i++){
            if(word2.charAt(i)== word1.charAt(0))
            dp[0][i] = 1;
            else if(i!= 0){
                dp[0][i] = dp[0][i-1];
            }
            
        }
        for(int i = 1; i<m; i++){
            for(int j = 1; j< n; j++){
                if(word1.charAt(i) != word2.charAt(j)){
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);


                }
                else{
                    dp[i][j] =  dp[i-1][j-1]+1;
                }
            }
        }
        return dp[m-1][n-1];

    }
}

