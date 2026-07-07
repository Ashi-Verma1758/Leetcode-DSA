class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long ans = 0;
        for(char c: String.valueOf(n).toCharArray()){
            if(c != '0'){
                ans = ans*10 + c-'0';
                sum += c-'0';
            }
        }
        return ans*sum;  
         }
}