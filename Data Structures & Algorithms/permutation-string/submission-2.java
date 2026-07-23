class Solution {
    boolean compare(int[] map1, int[] map2){
        for(int i=0;i<26;i++){
            if(map1[i]!=map2[i])
                return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        int len =s1.length();
        int[] map1=new int[26];
        Arrays.fill(map1, 0);
        for(int i=0;i<len;i++){
            map1[s1.charAt(i)-'a']++;
        }
        int[] map2=new int[26];
        Arrays.fill(map2, 0);
        for(int j=0;j<len;j++){
            map2[s2.charAt(j)-'a']++;
        }
        int left=0;
        int right=len-1;
        while(left<s2.length() && right<s2.length()){
            if(compare(map1, map2))
                return true;
            map2[s2.charAt(left)-'a']--;
            left++;
            right++;
            if(right<s2.length())
                map2[s2.charAt(right)-'a']++;
        }
        return false;
    }
}
