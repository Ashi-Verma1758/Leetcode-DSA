class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int i = 0, res = 0;
        for(int j = 0; j<s.length(); j++){
            char ch = s.charAt(j);
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
            while(mp.get(ch)>2){
                char left = s.charAt(i);
                mp.put(left, mp.get(left)-1);
                i++;
            }
            res = Math.max(res, j-i+1);
        }
        return res;
    }
}