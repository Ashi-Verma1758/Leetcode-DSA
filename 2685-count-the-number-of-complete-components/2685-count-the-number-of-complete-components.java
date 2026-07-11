class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int count =0;
        for(int i =0; i<n; i++){
            ans.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            ans.get(u).add(v);
            ans.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                ArrayList<Integer> comp = new ArrayList<>();
                dfsHelper(i, ans, visited, comp);

                int size = comp.size();
                boolean complete = true;

                for (int node : comp) {
                    if (ans.get(node).size() != size - 1) {
                        complete = false;
                        break;
                    }
                }

                if (complete)
                    count++;
            }
        }
        return count;
    }
    void dfsHelper(int vertex, ArrayList<ArrayList<Integer>> ans, boolean[] visited, ArrayList<Integer> comp){
        visited[vertex] = true;
        comp.add(vertex);
        for(int neighbour: ans.get(vertex)){
            if(!visited[neighbour]){
                dfsHelper(neighbour, ans, visited, comp);
            }
        }
    }
}