class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] visited = new boolean[101];
        for(int b : bulbs) visited[b] = !visited[b];
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i<101; ++i){
         if(visited[i]) ans.add(i);
            
        }
        return ans;
    }
}