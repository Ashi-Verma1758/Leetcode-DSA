class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        for(int i = 1; i < nums.length; i ++)
        {
            int num = nums[i];
            int prevMax = maxProduct;
            int prevMin = minProduct;
            maxProduct = Math.max(num, Math.max(num * prevMax, num * prevMin));
            minProduct = Math.min(num, Math.min(num * prevMax, num * prevMin));
            result = Math.max(result, maxProduct);
        }
        return result;
    }
}