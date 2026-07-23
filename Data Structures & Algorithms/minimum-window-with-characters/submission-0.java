class Solution {
    public String minWindow(String s, String t) {
        int[] mapt=new int[60];
        Arrays.fill(mapt, 0);
        for(int i=0;i<t.length();i++)
            mapt[t.charAt(i)-'A']++;
        
        int[] maps=new int[60];
        Arrays.fill(maps,0);

        int min=Integer.MAX_VALUE;
        String str="";

        int left=0;
        int right=0;

        while(right<s.length()){
            if(mapt[s.charAt(right)-'A']>0){
                maps[s.charAt(right)-'A']++;
                while(ifEquals(maps, mapt)){
                    if(min>right-left+1){
                        min=right-left+1;
                        str=s.substring(left, right+1);
                    }
                    if(maps[s.charAt(left)-'A']>0)
                        maps[s.charAt(left)-'A']--;
                    left++;
                }
            }
            right++;
        }
        return str;
    }

    boolean ifEquals(int[] maps, int[] mapt){
        for(int i=0;i<60;i++){
            if(maps[i]<mapt[i])
                return false;
        }
        return true;
    }
}
