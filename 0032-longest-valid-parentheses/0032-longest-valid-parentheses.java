class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new  Stack<>();
        stack.push(-1);
        int maxL = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    maxL = Math.max(maxL, i-stack.peek());
                }
            }
        }
        return maxL;
    }
}