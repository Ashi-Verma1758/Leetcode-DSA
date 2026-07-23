class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        List<Integer>[] adj = new ArrayList[n+1];
        for(int i =0; i<= n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] edge: edges){
            int u = edge[0];
            int v= edge[1];
            boolean[] visited = new boolean[n+1];
            if(doespathexist(u, v, adj, visited)){
                return edge;
            }
            adj[u].add(v);
            adj[v].add(u);

        }
        return new int[]{};
        
    }
    boolean doespathexist(int u, int v, List<Integer>[] adj, boolean[] visited){
        visited[u] = true;
        if(u==v) return true;
        for(Integer adjNode: adj[u]){
                if(!visited[adjNode]){
                    if(doespathexist(adjNode, v, adj, visited)) return true;
                }
            
        }
        return false;
    }
}