class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(st.isEmpty()) st.push(ch);
            else {
                char top=st.peek();
                if(ch!=top) st.push(ch);
                else st.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}