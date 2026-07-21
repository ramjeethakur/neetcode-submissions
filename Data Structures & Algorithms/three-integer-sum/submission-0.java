class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-3;i++){
            int left=i+1;
            int right=nums.length-1;
            int target=0-nums[i];
            while(left<right){
                int curr=nums[left]+nums[right];
                if(curr>target)
                    right--;
                else if(curr<target)
                    left++;
                else if(curr==target){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                }
            }
        }
        List<List<Integer>> res=ans.stream().distinct().collect(Collectors.toList());
        return res;
    }
}
