class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        int maxside =0;
        for(int i =1; i<=matrix.length; i++){
            for(int j =1; j<= matrix[0].length; j++){
                if(matrix[i-1][j-1] == '1'){
                    if((i-1)== 0 || (j-1)== 0){
                        dp[i][j] =1;
                    }else{
                        dp[i][j] = 1+Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                    }
                    maxside = Math.max(maxside, dp[i][j]);
                   
                }
            }
        }
        return maxside*maxside;
    }

}