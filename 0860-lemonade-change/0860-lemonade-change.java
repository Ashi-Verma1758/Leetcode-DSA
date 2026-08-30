class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(5, 0);
        mp.put(10, 0);
        mp.put(20, 0);
        for(int i = 0; i<bills.length; i++){
            if(bills[i] == 5){
                mp.put(5, mp.get(5)+1);
            }else if(bills[i] == 10){
                if(mp.get(5) == 0){
                    return false;
                }
                mp.put(5, mp.get(5)-1);
                mp.put(10, mp.get(10)+1);

            }else if( bills[i] == 20){
                if(mp.get(5) == 0 || mp.get(10) == 0 && mp.get(5)<3){
                    return false;
                }
                if(mp.get(10) >0){
                    mp.put(5, mp.get(5)-1);
                    mp.put(10, mp.get(10)-1);

                }else if(mp.get(5)>=3){
                    mp.put(5, mp.get(5)-3);

                }
                mp.put(20, mp.get(20) +1);
            }
        }
        return true;
    }
}