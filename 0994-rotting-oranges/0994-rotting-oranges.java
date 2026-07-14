class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return -1;
        for(int i =0; i<grid.length; i++){
            for(int j =0; j<grid[0].length; j++){
                if(grid[i][j] == 2){
                    dfsHelper(grid, i, j, 2);
                }
            }
        }
        int minute = 2;
        for(int[] row: grid){
            for(int cell: row){
                if(cell ==1) return -1;
                minute = Math.max(minute, cell);
            }
        }
        return minute-2;
    }
    void dfsHelper(int[][] grid, int i, int j, int minute){
        if(i>= grid.length || i<0 || j<0 || j>= grid[0].length || grid[i][j] == 0 ||(1< grid[i][j] && grid[i][j]<minute))return;
        else{
            grid[i][j] = minute;
            dfsHelper(grid, i+1, j, minute+1);
            dfsHelper(grid, i-1, j, minute+1);
            dfsHelper(grid, i, j-1, minute+1);
            dfsHelper(grid, i, j+1, minute+1);

        }
    }

}