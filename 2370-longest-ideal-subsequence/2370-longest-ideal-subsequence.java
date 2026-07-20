class Solution {
    public int longestIdealString(String s, int k) {
        int[] dp = new int[26];
        int  ans =1;
        for(int ch =0, n= s.length(); ch<n;ch++){
            int i = s.charAt(ch)-'a';
            dp[i] = dp[i]+1;
            for(int j = Math.max(0, i-k); j<= Math.min(25, i+k);j++){
                if(j!= i){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
        
    }
}