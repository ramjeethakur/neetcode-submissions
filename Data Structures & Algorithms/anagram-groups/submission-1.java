class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String, List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String curr=strs[i];
            int[] index=new int[26];
            Arrays.fill(index, 0);
            for(int j=0;j<curr.length();j++){
                index[curr.charAt(j)-'a']++;
            }
            String ind=Arrays.toString(index);
            map.putIfAbsent(ind, new ArrayList<>());
            List<String> val = map.get(ind);
            val.add(curr);
            map.put(ind, val);
        }

        for(List<String> tmp : map.values())
            ans.add(tmp);

        return ans;
    }
}
