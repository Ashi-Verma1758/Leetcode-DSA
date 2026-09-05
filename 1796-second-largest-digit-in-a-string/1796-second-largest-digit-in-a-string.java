class Solution {
    public int secondHighest(String s) {
        int sec = -1;
        int lar = -1;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch <='9'){
                int dig = ch -'0';
                if(dig>lar){
                    sec = lar;
                    lar = dig;
                }
                else if(dig>sec && dig!= lar){
                    sec = dig;
                }
            }
        }
        return sec;
    }
}