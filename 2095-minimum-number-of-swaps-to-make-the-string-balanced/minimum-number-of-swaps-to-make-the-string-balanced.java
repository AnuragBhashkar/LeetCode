class Solution {
    public int minSwaps(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[') st.push(ch);
            else{
                if(!st.isEmpty() && st.peek()=='[') st.pop();
                else st.push(ch);
            }
        }
        int unmatched=st.size()/2;
        return (unmatched+1)/2;
    }
}