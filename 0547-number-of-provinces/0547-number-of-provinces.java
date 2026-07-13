class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count =0;
        int V = isConnected.length;
        boolean[] visited = new boolean[V];
        for(int i =0; i<V; i++){
            if(!visited[i]){
                dfsHelper(i, isConnected, visited);
                count++;
            }
        }
        return count;

    }
    void dfsHelper(int Vertex, int[][] isConnected, boolean[] visited ){
        visited[Vertex] = true;
        for(int neighbour=0; neighbour<isConnected.length; neighbour++){
            if(!visited[neighbour] && isConnected[Vertex][neighbour] == 1){
                dfsHelper(neighbour, isConnected, visited);
            }
        }
    }

}