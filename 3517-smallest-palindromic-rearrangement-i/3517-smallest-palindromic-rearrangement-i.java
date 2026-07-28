class Solution {
    public String smallestPalindrome(String s) {
       int n = s.length();
       String middlechar = (n&1) == 1 ? s.charAt(n/2)+ "" : "";
       StringBuilder half = new StringBuilder();
       int[] hashtable = new int[26];
       for(int i =0; i<n/2; i++){
        hashtable[s.charAt(i) -'a']++;
       }
       for(int i =0; i<26; i++){
        half.append(
                ((char)(i + 'a') + "").repeat(hashtable[i])
            );
       }
       return half.toString() + middlechar +half.reverse().toString();
    }
}