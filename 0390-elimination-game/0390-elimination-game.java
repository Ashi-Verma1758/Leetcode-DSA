class Solution {
    public int lastRemaining(int n) {
        int step = 0;
        int sum =0;
        while(n>1){
            if(step%2 != 0  && n%2 == 0){
                sum+= (1<<step);
            }
            n = n/2;
            step++;
        }
        return (1<<step)-sum;
        
    }
}