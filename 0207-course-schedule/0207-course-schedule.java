class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        int[] in = new int[numCourses];
        for(int edge[] : prerequisites){
            int u = edge[0];
            int v = edge[1];
            in[u] += 1;
            adj.get(v).add(u);
        }
        Queue<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i<numCourses; i++){
            if(in[i] == 0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int val = q.poll();
            ans.add(val);
            for(int i =0; i<adj.get(val).size(); i++){
                int neighbour = adj.get(val).get(i);
                in[neighbour] -=1;
                if(in[neighbour] == 0){
                    q.offer(neighbour);
                }
            }
        }
        return (ans.size() == numCourses);
        
    }
}