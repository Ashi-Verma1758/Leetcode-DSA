class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int c1 = 0;
        int b1 = 0;
        int b2 = 0 ;
        int max = 0;
        int i =0;
        while(i<n){
            char ch = arr[i];
            if(ch == '0'){
                b1++;
                i++;
            }
            else{
                while(i<n && arr[i] == '1'){
                    i++;
                    c1++;
                }
                while(i<n && arr[i] == '0'){
                    i++;
                    b2++;
                }
                if(b1!= 0 && b2!= 0) max = Math.max(max, b1+b2);
                b1 = b2;
                b2 =0;
            }
        }
        return c1+max;
    }
}