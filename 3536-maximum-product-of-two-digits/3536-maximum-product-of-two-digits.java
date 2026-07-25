class Solution {
    public int maxProduct(int n) {
        int max = 0, sMax = 0;
        while(n>0){
           int  digit = n%10;
           if(digit>max){
            sMax = max;
            max = digit;
           }else if(digit>sMax) sMax = digit;
            n/= 10;
        }
        return max*sMax;
    }
}