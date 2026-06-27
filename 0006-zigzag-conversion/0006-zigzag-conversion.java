class Solution {
    public String convert(String s, int numRows) {
       if(numRows >s.length() || numRows == 1) return s;
       StringBuilder[] arr = new StringBuilder[numRows];
       for(int i =0; i<numRows; i++){
        arr[i] = new StringBuilder();
       }
       int idx = 0;
       int st = 1;
       for(char ch: s.toCharArray()){
        arr[idx].append(ch);
        if(idx == 0)st = 1;
        else if(idx == numRows-1) st=-1;
        idx+= st;
       }
       StringBuilder sb=new StringBuilder();
    for(int i=0;i<numRows;i++){
            sb.append(arr[i]);
    }

    return sb.toString();

    }
}