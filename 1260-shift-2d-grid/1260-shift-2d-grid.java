class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        k = k%total;
        for(int i =0; i<m ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j =0; j<n; j++){
                row.add(0);
            }
            ans.add(row);
        }
        for(int  i = 0; i<m ; i++){
            for(int j =0; j<n ; j++){
                int oldidx = i*n +j;
                int newidx = (oldidx + k)%total;
                int newrow = newidx/n;
                int newcol = newidx%n;
                ans.get(newrow).set(newcol, grid[i][j]);
            }
        }
        return ans;
    }
}