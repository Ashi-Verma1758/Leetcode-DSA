class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        double ans = 0.0;
        for(int i =0; i<n/2; i++){
            ans += getExpe(num.charAt(i));
        }
        for(int i =n/2; i<n; i++){
            ans -= getExpe(num.charAt(i));
        }
        return ans != 0.0;
    }
    double getExpe(char c){
        return c=='?' ? 4.5: c-'0';
    }
}