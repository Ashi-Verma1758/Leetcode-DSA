class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        for(int i =0; i<piles.length; i++){
            max = Math.max(max, piles[i]);
        }
        int ans =max;
        while(min<= max){
            int mid = min + (max-min)/2;
            long hrs =0;
            for(int pile : piles){
                hrs+=(pile +mid-1)/mid;
            }
            if(hrs<=h){
                ans = mid;
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }return ans;
    }
}