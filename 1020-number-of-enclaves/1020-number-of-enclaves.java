class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                if(( i==0 || j==0 || j == n-1 || i== m-1) && grid[i][j] ==1){
                    dfsHelper(i, j, grid);
                }
            }
        }
        int s= 0;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                s+= grid[i][j];
            }
        }
        return s;

    }
    void dfsHelper(int i, int j , int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || i>=m || j>=n || j<0 || grid[i][j] ==0) return;
        grid[i][j] =0;
        dfsHelper(i+1, j,grid);
        dfsHelper(i-1, j, grid);
        dfsHelper(i, j+1, grid);
        dfsHelper(i, j-1, grid);

    }
}