class Solution {
    boolean checkAnagrams(String base, String curr){
        if(base.length()!=curr.length())
            return false;
        int[] index=new int[26];
        Arrays.fill(index, 0);
        for(int i=0;i<base.length();i++){
            index[base.charAt(i)-'a']++;
            index[curr.charAt(i)-'a']--;
        }
        for(int j=0;j<index.length;j++){
            if(index[j]!=0)
                return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Set<String> ifDealt = new HashSet<>();
        List<List<String>> ans = new ArrayList<>();

        for(int iter=0;iter<strs.length;iter++){
            String base = strs[iter];
            if(ifDealt.contains(base))
                continue;
            ifDealt.add(base);
            List<String> currList = new ArrayList<>();
            currList.add(base);
            for(int secIter=iter+1;secIter<strs.length;secIter++){
                String curr=strs[secIter];
                if(checkAnagrams(base, curr)){
                    ifDealt.add(curr);
                    currList.add(curr);
                }
            }
            ans.add(currList);
        }
        return ans;
    }
}
