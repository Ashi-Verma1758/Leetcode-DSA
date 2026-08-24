class Solution {
    public boolean isPalindrome(String s) {
        return palin(s, 0, s.length()-1);

    }
    boolean palin(String s, int left, int right){
        while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }
         while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
        if(left>=right) return true;

        if(Character.toLowerCase(s.charAt(left)) !=  Character.toLowerCase(s.charAt(right))) return false;

        return palin(s, left+1, right-1);
    }
}