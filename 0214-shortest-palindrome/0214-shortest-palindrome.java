class Solution {
    public String shortestPalindrome(String s) {
        String s1 = new StringBuilder(s).reverse().toString();
        String str = s+"#"+s1;
        int[] lps = new int[str.length()];
        int len =0;
        int i =1;
        while(i<str.length()){
            if(str.charAt(i) == str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len>0){
                    len = lps[len-1];
                }else{
                    lps[i] =0;
                    i++;
                }
            }
        }
        int pallen = lps[str.length()-1];
        String rem = s.substring(pallen);
        String ans = new StringBuilder(rem).reverse().toString();
        return ans+s;
       
    }
    
    
}