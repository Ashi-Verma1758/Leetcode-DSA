class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            ans[i] = arr[i];
        }
        Arrays.sort(ans);
        int rank =1;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int ele: ans){
                if(!map.containsKey(ele))
                map.put(ele, rank++);
            }
            for(int i =0; i<arr.length; i++){
                arr[i] = map.get(arr[i]);
            }
            return arr;
    }
}