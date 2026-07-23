class Solution {
    int findmax(int[] arr, int left, int right){
        int max=Integer.MIN_VALUE;
        for(int i=left;i<=right;i++){
            max=Math.max(max, arr[i]);
        }
        return max;
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] max=new int[nums.length-k+1];
        max[0]=findmax(nums, 0, k-1);
        int left=1;
        int right=k;
        while(right<nums.length){
            if(max[left-1]<=nums[right]){
                max[left]=nums[right];
            } else if(nums[left-1]<max[left-1]){
                max[left]=Math.max(max[left-1], nums[right]);
            } else {
                max[left]=findmax(nums, left, right);
            }
            left++; right++;
        }
        return max;
    }
}
