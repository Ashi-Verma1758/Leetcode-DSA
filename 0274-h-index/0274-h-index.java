class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hidx = 0;
        for(int i = citations.length-1; i>= 0; i--){

            if(citations[i]>hidx){
                hidx++;
            }else{
                break;
            }
        }
        return hidx;
 }
}