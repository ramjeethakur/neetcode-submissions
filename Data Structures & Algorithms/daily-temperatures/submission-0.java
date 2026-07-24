class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            int curr=temperatures[i];
            while(!st.isEmpty() && st.peek().val<curr){
                Pair p=st.pop();
                ans[p.index]=(i-p.index);
            }
            st.push(new Pair(curr, i));
        }

        while(!st.isEmpty()){
            Pair pair=st.pop();
            ans[pair.index]=0;
        }
        return ans;
        
    }
}

class Pair{
    int val;
    int index;
    Pair(int val, int index){
        this.val=val;
        this.index=index;
    }
}
