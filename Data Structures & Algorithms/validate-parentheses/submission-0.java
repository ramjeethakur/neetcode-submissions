class Solution {
    public boolean isValid(String s) {
        if(s.length()<2)
            return false;
        Map<Character, Character> map=new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> st=new Stack<>();

        int right=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(!map.containsKey(ch)){
                st.push(ch);
            } else {
                if(st.isEmpty())
                    return false;
                else {
                    char curr=st.pop();
                    if(curr!=map.get(ch))
                        return false;
                }
                    

            }
            right++;
        }
        if(!st.isEmpty())
            return false;
        return true;
    }
}
