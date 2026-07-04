class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int maxsc = 0;
        for(int i =0; i<n; i++){
            maxsc = Math.max(maxsc, score[i]);
        }
        int[] score2 = new int[maxsc+1];
        for(int i =0; i<n; i++){
            score2[score[i]] = i+1;
        }
        String[] ans = new String[n];
        int place = 1;
        for(int i = maxsc; i>= 0; i--){
            if(score2[i]==0)continue;
            int act = score2[i] -1;
            if(place == 1){
            ans[act] = "Gold Medal";
            }
            else if(place == 2){
            ans[act] = "Silver Medal";
            }
            else if(place == 3){
            ans[act] = "Bronze Medal";
            }else{
                ans[act] = String.valueOf(place);
            }
            place++;
        }
        return ans;
    }
}