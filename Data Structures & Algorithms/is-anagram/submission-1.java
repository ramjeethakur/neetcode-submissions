class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        if(s.length()==0 && t.length()==0)
            return true;
        // Map<Character, Integer> map=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     char curr=s.charAt(i);
        //     map.put(curr, map.containsKey(curr)?map.get(curr)+1 : 1);
        // }

        // for(int i=0;i<t.length();i++){
        //     char currT=t.charAt(i);
        //     if(!map.containsKey(currT))
        //         return false;
        //     map.put(currT, map.get(currT)-1);
        // }

        // for(Integer value : map.values()){
        //     if(value>0)
        //         return false;
        // }        
        // return true;

        int[] arr = new int[26];
        Arrays.fill(arr, 0);

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
                return false;
        }
        return true;




    }
}
