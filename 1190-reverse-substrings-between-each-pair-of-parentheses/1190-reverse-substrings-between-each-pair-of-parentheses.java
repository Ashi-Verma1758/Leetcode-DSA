class Solution {
    public String reverseParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Integer> real = new Stack<>();
        for(char charr: s.toCharArray()){
            if(charr == '('){
                real.push(res.length());
            }
            else if(charr == ')'){
                int start = real.pop();
                rev(res, start,res.length()-1 );
            }else{
                res.append(charr);
            }
        }
        return res.toString();
    }
    void rev(StringBuilder sb, int start , int end){
        while(start<end){
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);

        }
    }
}