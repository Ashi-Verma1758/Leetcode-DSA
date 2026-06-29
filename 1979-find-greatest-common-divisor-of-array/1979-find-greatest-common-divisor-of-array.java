class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int a: nums){
            min = Math.min(a, min);
            max = Math.max(a, max);

        }
        int gcd = 1;
        for(int i =2; i<=Math.min(max, min); i++){
            if(min%i == 0 && max%i == 0){

                gcd = i;
            }
        }

        return gcd;

    }
}