class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minI = 0, maxI = 0;
        for(int i =0; i<n; i++){
            if(nums[i]<nums[minI]) minI = i;
            if(nums[i]>nums[maxI]) maxI = i;

        }
        int left = Math.min(minI, maxI);
        int right = Math.max(minI, maxI);
        int front = right+1;
        int back = n-left;
        int frontB = (left+1) + (n-right);
        return Math.min(front, Math.min(back, frontB));
    }
}