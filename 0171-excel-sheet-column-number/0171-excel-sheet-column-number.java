class Solution {
    public int titleToNumber(String columnTitle) {
        long ans =0;
        for(char ch : columnTitle.toCharArray()){
            ans = ans *26 +(ch - 'A'+1);
        }
        return (int)ans;
    }
}