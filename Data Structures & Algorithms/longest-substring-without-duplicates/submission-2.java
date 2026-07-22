class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        Map<Character, Integer> map=new HashMap<>();
        int left=0;
        int right=0;

        while(right<s.length()){
            char curr=s.charAt(right);
            if(map.containsKey(curr)){
                int lastPos=map.get(curr);
                left=Math.max(left, lastPos+1);
            }
            res=Math.max(res, right-left+1);
            map.put(curr, right);
            right++;
        }
        return res;
    }
    
}
