class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n%groupSize != 0) return false;
        Arrays.sort(hand);
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<hand.length; i++){
            mp.put(hand[i], mp.getOrDefault(hand[i], 0)+1);
        }
        for(int x: hand){
            if(!mp.containsKey(x)){
                continue;
            }
            for(int i= x; i<x+groupSize; i++){
                if(!mp.containsKey(i)){
                    return false;
                }
                mp.put(i, mp.get(i)-1);
                if(mp.get(i)== 0){
                    mp.remove(i);
                }
            }
        }
        return true;
    }
}