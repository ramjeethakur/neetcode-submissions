class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i], i);
        }

        for(int i=0;i<numbers.length;i++){
            int rem=target-numbers[i];
            if(map.containsKey(rem)){
                int index=map.get(rem);
                if(index==i)
                    continue;
                if(i>index){
                    ans[0]=index+1;
                    ans[1]=i+1;
                } else {
                    ans[0]=i+1;
                    ans[1]=index+1;
                }
            }
        }
        return ans;
    }
}
