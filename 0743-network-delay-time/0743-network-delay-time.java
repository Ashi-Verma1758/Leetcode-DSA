class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i =0; i<=n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] time: times){
            adj.get(time[0]).add(new int[]{time[1], time[2]});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.add(new int[]{0,k});
        int[] network = new int[n+1];
        Arrays.fill(network, Integer.MAX_VALUE);
        network[k] = 0;
        while(!pq.isEmpty()){
            int[] top = pq.poll();
            int curt= top[0], cur = top[1];
            for(int[] time: adj.get(cur)){
               int newcur= time[0];
                int newtime = curt+time[1];
                if(newtime<network[newcur]){
                    network[newcur] = newtime;
                    pq.add(new int[]{newtime, newcur});

                }
            }
        }
        int mintime = 0;
        for(int i = 1; i<=n; i++){
            if(network[i] == Integer.MAX_VALUE)
                return -1;
            
            mintime = Math.max(mintime, network[i]);
        } 
        return mintime;
    }
}