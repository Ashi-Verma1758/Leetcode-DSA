class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rowLen = triangle.size();
        int[] row = new int[rowLen];
        for(int i =0; i<rowLen; i++){
            row[i] = triangle.get(rowLen-1).get(i);
        }
        for(int r= rowLen -2; r>= 0; r--){
            for(int c=0; c<=r; c++){
                row[c]= Math.min(row[c], row[c+1]) + triangle.get(r).get(c);
            }
        }
        return row[0];
    }
}