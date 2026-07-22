class Solution {
    int[][] dp;

    public int superEggDrop(int k, int n) {
        dp = new int[k+1][n+1];
        for(int[] dpin: dp) Arrays.fill(dpin, -1);
        return eggDrop(k,n);
        
    }
    int eggDrop(int k, int n){
        if(n==0 || n==1) return n;
        if (k==1) return n;
        if(dp[k][n]!= -1) return dp[k][n];
        int ans =n, i=1, nn =n;
        while(i<= nn){
            int mid = i+(nn-i)/2;
            int broke = eggDrop(k-1, mid-1);
            int nobroke = eggDrop(k, n-mid);
            if(broke>nobroke) nn = mid-1;
            else i = mid+1;
            ans = Math.min(ans, Math.max(broke, nobroke)+1);
        }
        return dp[k][n] = ans;
    }
}