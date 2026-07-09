class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length()==0){
            return res;
        }
        Map<Character, String> dtl= new HashMap<>();
        dtl.put('2', "abc");
        dtl.put('3', "def");
        dtl.put('4', "ghi");
        dtl.put('5', "jkl");
        dtl.put('6', "mno");
        dtl.put('7', "pqrs");
        dtl.put('8', "tuv");
        dtl.put('9', "wxyz");
        backtrack(digits, 0, new StringBuilder(), res, dtl);
        return res;

    }
    void backtrack(String digits, int idx, StringBuilder comb, List<String> res, Map<Character, String> dtl){
        if(idx == digits.length()){
            res.add(comb.toString());
            return;
        }
        String letters = dtl.get(digits.charAt(idx));
        for(char letter: letters.toCharArray()){
            comb.append(letter);
            backtrack(digits, idx+1, comb, res, dtl);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}