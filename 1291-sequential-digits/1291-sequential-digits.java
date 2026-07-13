class Solution {
    int[] q = new int[45];
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        int n =0;
        for(int i =1; i<10; i++){
            q[n++] =i;
        }
        for(int i =0; i<n; i++){
            int d = q[i] %10;
            if(d<9){
                q[n++] = q[i]*10+d+1;
            }
        }
        for(int x: q){
            if(x>=low &&x<= high) ans.add(x);
        }
        return ans;
        
    }
}