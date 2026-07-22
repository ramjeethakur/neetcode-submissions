class Solution {
    public int trap(int[] height) {
        int res=0;
        int[] prefix= new int[height.length];
        prefix[0]=0;
        int[] suffix= new int[height.length];
        suffix[height.length-1]=0;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=Math.max(prefix[i-1], height[i-1]);
        }
        for(int j=height.length-2;j>=0;j--){
            suffix[j]=Math.max(suffix[j+1], height[j+1]);
        }

        for(int k=0;k<height.length;k++){
            int boundary = Math.min(prefix[k], suffix[k]);
            if(height[k]<boundary)
                res+=(boundary-height[k]);
        }
        return res;

    }
}
