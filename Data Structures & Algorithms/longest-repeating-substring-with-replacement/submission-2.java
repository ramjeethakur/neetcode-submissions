class Solution {
    public int characterReplacement(String s, int k) {
        int res=0;
        Map<Character, Integer> map=new HashMap<>();
        int maxFreq=0;
        int left=0;
        int right=0;

        while(right<s.length()){
            char ch=s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            maxFreq=Math.max(maxFreq, map.get(ch));
            while(right-left+1-maxFreq>k){
                char leftChar=s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);
                left++;
            }
            res=Math.max(res, right-left+1);
            right++;
        }
        return res;
    }
}
