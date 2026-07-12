class Solution {
    public int reversePairs(int[] nums) {
       return mergesort(nums, 0, nums.length-1);

    }
    void merge(int[] nums, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<= mid && right<= high){
            if(nums[left] <nums[right]){
                temp.add(nums[left++]);
            }else{
                temp.add(nums[right++]);

            }
        }
        while(left<= mid) temp.add(nums[left++]);
        while(right<= high) temp.add(nums[right++]);
        for(int i = low; i<= high; i++){
            nums[i] = temp.get(i-low);
        }

    }
    int countPairs(int[] nums, int low, int mid, int high){
        int cnt =0;
        int right = mid+1;
        for(int i = low; i<=mid; i++){
            while(right<=high && (long)nums[i] >(long)2*nums[right]){
                right++;
            }
            cnt+= (right- (mid+1));
        }
        return cnt;
    }
    int mergesort(int[] nums , int low, int high){
        if(low>= high) return 0;
        int mid = (low+high)/2;
        int cnt= mergesort(nums, low, mid);
        cnt+= mergesort(nums, mid+1, high);
        cnt+= countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);
        return cnt;
    }
}

// brute force

//  int count =0;
//         for(int i =0; i<nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 if((long)nums[i] > (long)2*nums[j]){
//                     count++;
//                 }
//             }
//         }
//         return count;