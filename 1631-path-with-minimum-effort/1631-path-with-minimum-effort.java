class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int  n= heights[0].length;

        int[][] effort = new int[m][n];
        for(int[] row: effort){
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        effort[0][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.offer(new int[]{0,0, 0});
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int cureffort = curr[0];
            int r= curr[1];
            int c = curr[2];
            if(cureffort > effort[r][c]){
                continue;
            }
            if( r== m-1 && c== n-1 ){
                return cureffort;
            }
            for(int i = 0; i<4; i++){
            int nr = r+ dr[i];
            int nc = c + dc[i];
            if(nr>= 0 && nr<m && nc>= 0 && nc<n){
                int diff = Math.abs(heights[r][c] - heights[nr][nc]);
                int neweff = Math.max(cureffort, diff);
                if(neweff<effort[nr][nc]){
                    effort[nr][nc] = neweff;
                    pq.offer(new int[]{neweff, nr, nc});

                }
            }
            }
        }
        return 0;
    }
}