class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int[] freq = new int[100005];
        for(int x: arr){
            freq[Math.min(x, arr.length)]++;
           
        }
         int res = 1;
            for(int i =2; i<=arr.length; i++){
                res = Math.min(res+freq[i] , i);
            }
            for(int i =0; i<=arr.length; i++){
                freq[i] = 0;

            }
        return res;
    }
}