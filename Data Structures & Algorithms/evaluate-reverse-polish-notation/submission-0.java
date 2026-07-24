class Solution {
    int solve(int val1, int val2, String op){
        switch(op){
            case "+":
                return val1+val2;
            case "-":
                return val1-val2;
            case "*":
                return val1*val2;
            case "/":
                return val1/val2;
        }
        return -1;
    }
    public int evalRPN(String[] tokens) {
        Set<String> set=new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<tokens.length;i++){
            if(!set.contains(tokens[i])){
                st.push(Integer.parseInt(tokens[i]));
            } else {
                int val2=st.pop();
                int val1=st.pop();
                int curr=solve(val1, val2, tokens[i]);
                st.push(curr);
            }
        }
        int ans=st.pop();
        return ans;
    }
}
