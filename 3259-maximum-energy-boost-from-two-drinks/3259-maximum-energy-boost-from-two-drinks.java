class Solution {
    long[][] dp;
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        
        int n = energyDrinkA.length;
        dp = new long[n][2];
        for(long[] row: dp){
            Arrays.fill(row, -1);
        }
        return Math.max(fun(energyDrinkA, energyDrinkB, 0, 1), fun(energyDrinkA, energyDrinkB, 0, 0));
        
    }
    long fun(int[] energyDrinkA, int[] energyDrinkB, int i , int j){
        if(i>= energyDrinkA.length) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        long ans = 0; 
        if(j== 1){
            ans = Math.max(energyDrinkA[i]+ fun(energyDrinkA, energyDrinkB, i+1, j), fun(energyDrinkA, energyDrinkB, i+1, 1-j));
        }else{
            ans = Math.max(energyDrinkB[i]+ fun(energyDrinkA, energyDrinkB, i+1, j), fun(energyDrinkA, energyDrinkB, i+1, 1-j));

        }
        return dp[i][j] = ans;
    }
}