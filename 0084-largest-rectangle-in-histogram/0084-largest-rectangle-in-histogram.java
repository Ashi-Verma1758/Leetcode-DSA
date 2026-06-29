class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int maxArea = 0;
        for(int i =0; i<=n; i++){
            int cur = (i==n)?0: heights[i];
            while(!stack.isEmpty() && cur<heights[stack.peek()]){
                int height = heights[stack.pop()];
                int right = i;
                int left = stack.isEmpty()?-1:stack.peek();
                int width = right - left-1;
                int area = width*height;
                maxArea = Math.max(area, maxArea);
            }
            stack.push(i);
        }
        return maxArea;

    }
}