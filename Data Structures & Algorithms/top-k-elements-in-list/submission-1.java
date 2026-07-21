class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            map.put(curr, map.getOrDefault(curr, 0)+1);
        }

        List<List<Integer>> bucket = new ArrayList<>();
        for(int i=0;i<nums.length+1;i++)
            bucket.add(new ArrayList<>());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            bucket.get(entry.getValue()).add(entry.getKey());
        }

        int[] ans=new int[k];
        int pointer = 0;
        for(int i=nums.length;i>0;i--){
            List<Integer> tmp=bucket.get(i);
            for(int n : tmp){
                ans[pointer]=n;
                pointer++;
                if(pointer>=k)
                    return ans;
            }
        }
        return ans;

    }
}
