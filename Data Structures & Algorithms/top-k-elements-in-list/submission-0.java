class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            map.put(curr, map.containsKey(curr)?map.get(curr)+1 : 1);
        }

        PriorityQueue<Pair> PQ =new PriorityQueue<>((Pair p1, Pair p2) -> p2.freq-p1.freq);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            PQ.add(new Pair(entry.getKey(), entry.getValue()));
        }

        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            Pair tmp= PQ.poll();
            ans[i]=tmp.val;
        }
        return ans;
    }
}
class Pair{
    int val;
    int freq;
    Pair(int val, int freq){
        this.val=val;
        this.freq=freq;
    }
}
