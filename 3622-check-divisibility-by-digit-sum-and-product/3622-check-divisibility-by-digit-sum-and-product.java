class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum = 0;
        int mul =1;
        while(n>0){
            int dig = n%10;
            sum += dig;
            mul *= dig;
            n /= 10;
        }
        sum = sum +mul;
        return original%sum ==0;
    }
}