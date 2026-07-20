class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans =new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             ans[0]=i;
        //             ans[1]=j;
        //             return ans;
        //         }
        //     }
        // }
        // return ans;



        // Map<Integer, Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i], i);
        // }

        // for(int i=0;i<nums.length;i++){
        //     int rem=target-nums[i];
        //     if(map.containsKey(rem) && map.get(rem)!=i){
        //         ans[0]=i;
        //         ans[1]=map.get(rem);
        //         return ans;
        //     }
        // }
        // Arrays.sort(ans);
        // return ans;


        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                ans[0]=i;
                ans[1]=map.get(rem);
                Arrays.sort(ans);
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;

    }
}
