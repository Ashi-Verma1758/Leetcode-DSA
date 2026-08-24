class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int count = 0;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(!vis[i][j] && grid[i][j] =='1'){
                    dfsHelper(grid, vis, i, j);
                    count++;
                }
            }
        }
        return count;

    }
    void dfsHelper(char[][] grid, boolean[][] vis, int i , int j ){
        int m = grid.length;
        int n = grid[0].length;
        if(i>= m || i<0 || j>=n ||j<0 || vis[i][j]  || grid[i][j] == '0') return;
        vis[i][j] = true;

        dfsHelper(grid, vis, i+1, j);
        dfsHelper(grid, vis, i, j+1);
        dfsHelper(grid, vis, i, j-1);
        dfsHelper(grid, vis, i-1, j);

    }
}