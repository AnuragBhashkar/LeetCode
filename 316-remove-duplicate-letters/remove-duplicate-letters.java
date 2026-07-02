class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder ans=new StringBuilder();
        int n=s.length();

        int[] lastIdx=new int[26];
        Arrays.fill(lastIdx,-1);
        for(int i=0;i<n;i++){
            lastIdx[s.charAt(i)-'a']=i;
        }

        boolean[] seen=new boolean[26];
        Stack<Character> st=new Stack<>();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            if(seen[idx]) continue;

            while(!st.isEmpty() && ch<st.peek() && lastIdx[st.peek()-'a']>i){
                seen[st.pop()-'a']=false;
            }
            st.push(ch);
            seen[idx]=true;
        }

        while(!st.isEmpty()) ans.append(st.pop());
        return ans.reverse().toString();
    }
}