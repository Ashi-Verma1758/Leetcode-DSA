class Solution {
    public int maxRotateFunction(int[] nums) {
        int n =nums.length;
        long sum =0;
        long f= 0;
        for(int i =0; i<n; i++){
            sum += nums[i];
            f += (long)i*nums[i];
        }
        long res = f;
        for(int i =1; i<n; i++){
            f = f+sum-(long)n*nums[n-i];
            res = Math.max(res, f);
        }
        return (int)res;
    }
   
}