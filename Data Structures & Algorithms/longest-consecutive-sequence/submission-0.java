class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            set.add(nums[i]);
        
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int counter=0;
            while(set.contains(curr)){
                counter++;
                curr++;
            }
            max=Math.max(max, counter);
        }
        return max;
    }
}
